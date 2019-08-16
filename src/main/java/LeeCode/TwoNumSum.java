package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class TwoNumSum {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */

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
