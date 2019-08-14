public class BubbleSort {

    public static int[] bubble_sort(int[] num) {
        int temp;
        int numlen = num.length;
        for (int i = 0; i < numlen - 1; i++) {
            boolean flag = false;
            for (int j = numlen - 1; i < j; j--) {
                if (num[j] < num[j - 1]) {
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
            Sout.soutNum(num);
        }
        return num;
    }
}
