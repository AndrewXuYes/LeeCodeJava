package leecode;

import java.util.Arrays;

public class _66_plusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) return digits;
        }
        //如果全部都不是9999再之前已经被返回
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 6, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})));
    }
}
