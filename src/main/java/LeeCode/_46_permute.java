package LeeCode;

import java.util.Arrays;
import java.util.List;

public class _46_permute {
    //error
    public static List<List<Integer>> permute(int[] nums) {

        Arrays.sort(nums);

        return null;
    }

    public static void main(String[] args) {

        int[] a = {1, 5, 1, 2};
        System.out.println(permute(a));
    }
}
