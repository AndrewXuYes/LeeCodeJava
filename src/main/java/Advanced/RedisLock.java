package Advanced;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.Collections;

/**
 * @描述：Redis 做分布式锁，利用 redis的setnx（SET if Not eXists）命令 和 getset 命令，即下面代码中的方法 setIfAbsent 和 getAndSet
 */
public class RedisLock {


    /**
     * 尝试获取分布式锁
     *
     * @param jedis      Redis客户端
     * @param lockKey    锁
     * @param requestId  请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    private static final String LOCK_SUCCESS = "OK";
    private static final String SET_IF_NOT_EXIST = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";

    public static boolean tryGetDistributedLock(Jedis jedis, String lockKey, String requestId, int expireTime) {
        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
        return LOCK_SUCCESS.equals(result);
    }

    /**
     * 释放分布式锁
     * lua
     */
    private static final Long RELEASE_SUCCESS = 1L;

    public static boolean releaseDistributedLock(Jedis jedis, String lockKey, String requestId) {
        String script = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        Object result = jedis.eval(script, Collections.singletonList(lockKey), Collections.singletonList(requestId));
        return RELEASE_SUCCESS.equals(result);

    }


    /***
     *
     * Another
     *
     */
    /**
     * 加锁
     *
     * @param key   被秒杀商品的id
     * @param value 当前线程操作时的 System.currentTimeMillis() + 2000，2000是超时时间，这个地方不需要去设置redis的expire，
     * 也不需要超时后手动去删除该key，因为会存在并发的线程都会去删除，造成上一个锁失效，结果都获得锁去执行，并发操作失败了就。
     */
    private StringRedisTemplate redisTemplate;

    public boolean lock(String key, String value) {
        //如果key值不存在，则返回 true，且设置 value

        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {
            return true;
        }

        //获取key的值，判断是是否超时
        String curVal = redisTemplate.opsForValue().get(key);
        if (StringUtils.isNotEmpty(curVal) && Long.parseLong(curVal) < System.currentTimeMillis()) {
            //获得之前的key值，同时设置当前的传入的value。这个地方可能几个线程同时过来，但是redis本身天然是单线程的，所以getAndSet方法还是会安全执行，
            //首先执行的线程，此时curVal当然和oldVal值相等，因为就是同一个值，之后该线程set了自己的value，后面的线程就取不到锁了
            String oldVal = redisTemplate.opsForValue().getAndSet(key, value);
            return StringUtils.isNotEmpty(oldVal) && oldVal.equals(curVal);
        }
        return false;
    }

    /**
     * 解锁
     */
    public void unlock(String key, String value) {
        try {
            String curVal = redisTemplate.opsForValue().get(key);
            if (StringUtils.isNotEmpty(curVal) && curVal.equals(value)) {
                redisTemplate.opsForValue().getOperations().delete(key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

