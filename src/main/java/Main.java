class Main {
    public static void main(String[] args) {
        int[] num = {6, 1, 2, 7, 9, 3, 4, 5, 0, 8,9,6,7};
        soutNum(num);
        quickSort(num, 0, num.length - 1);
    }

    private static void quickSort(int[] num, int left, int right) {
        if (left < right) {

            int mid, i, j, temp;
            mid = num[left];
            i = left;
            j = right;
            while (i != j) {
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

            soutNum(num);

            quickSort(num, left, mid - 1);
            quickSort(num, mid + 1, right);
        }
    }

    private static void soutNum(int[] num) {
        for (int tttt : num) {
            System.out.print(tttt + " ");
        }
        System.out.println();
    }

}
