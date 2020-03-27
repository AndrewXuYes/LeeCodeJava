package LeeCode;

public class _45_jump {
    public static int jump(int[] nums) {
        int tail = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);

            if (i == tail) { //遇到边界，就更新边界，并且步数加一
                tail = maxPosition;
                steps++;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

}
