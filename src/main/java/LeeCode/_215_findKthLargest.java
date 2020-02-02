package LeeCode;


import static Utils.Sout.soutNum;

public class _215_findKthLargest {


    public static int findKthLargest(int[] nums, int k) {

        if (k > nums.length) return 0;
        nums = Basic.HeadSort.headsort(nums);
        soutNum(nums);
        return nums[nums.length - k];
    }


    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));

    }
}
