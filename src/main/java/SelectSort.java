public class SelectSort {

    public static int[] select_sort(int[] num) {
        int numlen = num.length;
        int flag = 0;

        for (int i = 0; i < numlen; i++) {
            int min = num[i];
            for (int j = i; j < numlen; j++) {
                if (num[j] <= min) {
                    min = num[j];
                    flag = j;
                }
            }
            int temp = num[i];
            num[i] = num[flag];
            num[flag] = temp;
        }
        return num;
    }
}
