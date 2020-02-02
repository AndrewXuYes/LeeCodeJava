package LeeCode;


import java.util.PriorityQueue;

import static Utils.Sout.soutNum;

public class _215_findKthLargest {


    public static int findKthLargest(int[] nums, int k) {

        if (k > nums.length) return 0;
        nums = Basic.HeadSort.headsort(nums);
        soutNum(nums);
        return nums[nums.length - k];
    }


    public static int findKthLargest2(int[] nums, int k) {
        //定义PriorityQueue，默认从小到大
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> n1 - n2);
        for (int n : nums) {
            heap.add(n);
            //思路是创建一个大顶堆，将所有数组中的元素加入堆中，并保持堆的大小小于等于 k。这样，堆中就保留了前 k 个最大的元素。
            if (heap.size() > k)
                heap.poll();
        }
        //返回堆顶僧打
        return heap.poll();
    }


    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println();
        System.out.println(findKthLargest2(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(findKthLargest2(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));

    }
}
