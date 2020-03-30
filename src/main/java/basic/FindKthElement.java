package basic;

import utils.Sout;

public class FindKthElement {

    /**
     * 快速排序的 partition() 方法，对于数组 nums 的 [l, h] 区间，会返回一个整数 k 使得 nums[l..k-1] 小于等于 nums[k]，
     * 且 nums[k+1..h] 大于等于 nums[k]，此时 nums[k] 就是数组的第 k 大元素。\
     * 可以利用这个特性找出数组的 Kth Element，这种找 Kth Element 的算法称为快速选择算法。
     * <p>
     * 时间复杂度 O(N)、空间复杂度 O(1)
     * 只有当允许修改数组元素时才可以使用
     */
    public static int findKthElement(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) break;
            else if (j < k) l = j + 1;
            else h = j - 1;
        }
        return nums[k];
    }

    private static int partition(int[] a, int l, int h) {
        int i = l, j = h + 1;
        while (true) {
            while (a[++i] < a[l] && i < h) ;
            while (a[--j] > a[l] && j > l) ;
            if (i >= j) break;
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        swap(nums, 1, 2);
        Sout.soutNum(nums);
    }

}
