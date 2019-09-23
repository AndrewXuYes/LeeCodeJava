package LeeCode;

public class _4_findMedianSortedArrays {

    /**
     * 首先是怎么将奇数和偶数的情况合并一下。
     * <p>
     * 用 len 表示合并后数组的长度，如果是奇数，我们需要知道第 （len+1）/2 个数就可以了，如果遍历的话需要遍历 int(len/2 ) + 1 次。如果是偶数，我们需要知道第 len/2和 len/2+1 个数，也是需要遍历 len/2+1 次。所以遍历的话，奇数和偶数都是 len/2+1 次。
     * <p>
     * 返回中位数的话，奇数需要最后一次遍历的结果就可以了，偶数需要最后一次和上一次遍历的结果。所以我们用两个变量 left 和 right，right 保存当前循环的结果，在每次循环前将 right 的值赋给 left。这样在最后一次循环的时候，left 将得到 right 的值，也就是上一次循环的结果，接下来 right 更新为最后一次的结果。
     * <p>
     * 循环中该怎么写，什么时候 A 数组后移，什么时候 B 数组后移。用 aStart 和 bStart 分别表示当前指向 A 数组和 B 数组的位置。如果 aStart 还没有到最后并且此时 A 位置的数字小于 B 位置的数组，那么就可以后移了。也就是aStart＜m&&A[aStart]< B[bStart]。
     * <p>
     * 但如果 B 数组此刻已经没有数字了，继续取数字 B[ bStart ]，则会越界，所以判断下 bStart 是否大于数组长度了，这样 || 后边的就不会执行了，也就不会导致错误了，所以增加为 aStart＜m&&(bStart)>= n||A[aStart]<B[bStart])。
     */
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int Alen = A.length;
        int Blen = B.length;
        int sumlen = Alen + Blen;
        int left = -1, right = -1;
        int AStart = 0, BStart = 0;

        for (int i = 0; i < sumlen / 2; i++) { //奇偶通用
            left = right;
            if (AStart < Alen &&
                    (BStart >= Blen || A[AStart] < B[BStart]))
                right = B[AStart++];
            else right = B[BStart++];
        }
11
        if ((sumlen & 1) == 0) return (left + right) / 2.0; //偶
        else return right; //奇
    }

    public static void main(String[] args) {

        int[] A = {1, 3};
        int[] B = {2};
        int[] nums3 = {1, 2, 5, 6};
        int[] nums4 = {3, 4, 5, 9};
//        System.out.println(findMedianSortedArrays(A, B));
        System.out.println(findMedianSortedArrays(nums3, nums4));
    }
}
