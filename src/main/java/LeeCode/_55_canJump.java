package LeeCode;

/**
 * @author andrew
 * @date 2020/3/28 15:14
 */
public class _55_canJump {


    public static boolean canJump(int[] nums) {
        int position = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--)
            if (i + nums[i] >= position)
                position = i;
        return position == 0;
    }



    //动态规划
    //一递归就感觉智商不够用
    public boolean canJump2(int[] nums) {
        return canJumpFromPosition2(0, nums);
    }
    public boolean canJumpFromPosition2(int position, int[] nums) {
        if (position == nums.length - 1) return true;
        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++)
            if (canJumpFromPosition2(nextPosition, nums))
                return true;
        return false;
    }




    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}
