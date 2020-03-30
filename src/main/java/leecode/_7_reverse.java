package leecode;

import cn.hutool.core.convert.Convert;

public class _7_reverse {

    public static int reverse(int x) {
        //忽略边界问题
        int flag = 1, temp = x, count = 0;
        if (x < 0) flag = -1;
        x = Math.abs(x);
        StringBuilder stringBuilder = new StringBuilder(Convert.toStr(x)).reverse();
        return Convert.toInt(stringBuilder) * flag;
    }

    public static int reverse2(int x) {
        //捕获异常解决越界问题
        StringBuilder str = new StringBuilder("");
        if (x < 0) str.append("-");
        try {
            return Convert.toInt(str.toString() + new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static int reverse3(int x) {
        //忽略边界问题
        int pop = 0, temp = x, res = 0;
        while (temp != 0) {
            pop = temp % 10;
            res = res * 10 + pop;
            temp /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse3(2345));
        System.out.println(reverse3(-355));
    }
}
