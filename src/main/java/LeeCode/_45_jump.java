package LeeCode;

public class _45_jump {

    //贪心算法
    public static int jump(int[] nums) {
        int tail = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            //算出每个位置最长可控范围
            maxPosition = Math.max(maxPosition, nums[i] + i);

            //遇到边界，就更新边界，并且步数加一
            if (i == tail) {
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
