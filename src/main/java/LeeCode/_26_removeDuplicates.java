package LeeCode;

import java.util.HashSet;

public class _26_removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) hashSet.add(num);
        int[] nums2 = new int[hashSet.size()-1];
        int i = 0;
        for (Integer integer : hashSet) {
            nums2[i++] = integer;
        }

        for (int j = 0; j < hashSet.size() - 1; j++) {
            System.out.println(nums2[j]);
        }
        return hashSet.size();
    }

    public static int removeDuplicates2(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) hashSet.add(num);
        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3, 4};
        System.out.println("removeDuplicates=="+removeDuplicates(nums));
        System.out.println("removeDuplicates2=="+removeDuplicates2(nums));
    }
}
