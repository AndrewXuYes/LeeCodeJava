package leecode;

import java.util.HashMap;
import java.util.Map;

public class _1_twoNumSum {

    /**
     * 在进行迭代并将元素插入到表中的同时，
     * 检查表中是否已经存在当前元素所对应的目标元素。
     * 如果它存在，那我们已经找到了对应解，并立即将其返回。
     */

    public static int[] helloTwoNumSum(int a[], int b) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hashMap.containsKey(b - a[i]))
                return new int[]{hashMap.get(b - a[i]), i};
            hashMap.put(a[i], i);
        }

        return new int[]{-1, -1};
    }


}
