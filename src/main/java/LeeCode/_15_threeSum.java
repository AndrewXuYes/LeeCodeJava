package LeeCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _15_threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (k > 0 && nums[k] == nums[k - 1]) continue; // 去重

            int start = k + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[k] + nums[start] + nums[end];
                if (sum < 0) start++;
                else if (sum > 0) end--;
                else res.add(new ArrayList<>(Arrays.asList(nums[k], nums[start++], nums[end--])));
            }
        }
        //返回前去重
        return res.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("threeSum==" + threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("threeSum==" + threeSum(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
