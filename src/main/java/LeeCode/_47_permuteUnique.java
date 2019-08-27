package LeeCode;

import java.util.Arrays;
import java.util.List;

public class _47_permuteUnique {
    //error
    public static List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        return null;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 1, 2};
        System.out.println(permuteUnique(a));
    }
}
