package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {

    public static int[] helloTwoNumSum(int a[], int b) {

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            System.out.println(i);
            if (hashMap.containsKey(b - a[i])) {
                return new int[]{hashMap.get(b - a[i]), i};
            }
            hashMap.put(a[i], i);
        }
        return new int[]{-1, -1};
    }
}
