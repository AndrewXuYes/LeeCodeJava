public class MergeSort {

    public static int[] merge_sort(int[] num1, int[] num2) {
        int num1len = num1.length;
        int num2len = num2.length;
        int i = 0, j = 0, k = 0;
        int[] c = new int[10];
        while (i < num1len && j < num2len) {
            if (num1[i] <= num2[j] && i < num1len) {
                c[k++] = num1[i++];
            }
            if (num1[i] >= num2[j]) {
                c[k++] = num2[j++];
            }
        }
        if (i < num1len) {
            while (i < num1len) {
                c[k++] = num1[i++];
            }
        }
        if (j < num2len) {
            while (j < num2len) {
                c[k++] = num2[j++];
            }
        }
        return c;
    }
}
