package LeeCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _46_permute {

    public static void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int first) {
        if (first == n) output.add(new ArrayList<Integer>(nums));
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }

    public static LinkedList permute(int[] nums) {
        LinkedList output = new LinkedList();
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num : nums) nums_lst.add(num);

        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }


    public static void main(String[] args) {

        int[] a = {1, 2, 3,3,5,4,3,6,3,3,4,6,4};
        System.out.println(permute(a));
    }
}
