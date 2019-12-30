package LeeCode;

import Utils.Sout;

import java.util.Arrays;

public class _16_threeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        Sout.soutNum(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - ans)) ans = sum;
                if (sum < target) start++;
                else if (sum > target) end--;
                else return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {


        int[] nums = {1, 2, 5, -5, -7, 3, 0};
        int target = 3;

        System.out.println(threeSumClosest(nums, target));
    }
}
