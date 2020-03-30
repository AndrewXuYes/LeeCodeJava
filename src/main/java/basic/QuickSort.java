package basic;

import utils.Sout;

public class QuickSort {

    public static void quickSort(int[] num, int left, int right) {
        if (left < right) {

            int mid, i, j, temp;
            mid = num[left];
            i = left;
            j = right;
            while (i < j) {
                while (mid <= num[j] && i < j) j--;
                while (mid >= num[i] && i < j) i++;
                if (i < j) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            num[left] = num[i];
            num[i] = mid;

            Sout.soutNum(num);
            quickSort(num, left, mid - 1);
            quickSort(num, mid + 1, right);
        }
    }

}
