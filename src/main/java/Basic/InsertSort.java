package Basic;

import Utils.Sout;

public class InsertSort {
    //ERROR
    public static void insertionSort(int[] num) {
        if (num == null || num.length < 2) return;
        for (int i = 1; i < num.length; i++) {
            int cur = num[i];
            boolean flag = false;
            for (int j = i - 1; j >= 0; j--) {
                if (cur < num[j]) {
                    num[j + 1] = num[j];
                } else {
                    num[j] = cur;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                num[0] = cur;
            }
            Sout.soutNum(num);
        }
    }
}
