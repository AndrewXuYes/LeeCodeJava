package LeeCode;

import java.util.Arrays;
import java.util.List;

public class _47_permuteUnique {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        //回溯放，放弃
        Arrays.sort(nums);

        return null;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 1, 2};
        System.out.println(permuteUnique(a));
    }
}
