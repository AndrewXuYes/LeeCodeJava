package LeeCode;

import cn.hutool.core.convert.Convert;

public class _9_isPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String xx = Convert.toStr(x);
        int xlen = xx.length();
        for (int i = 0; i < xlen / 2; i++)
            if (xx.charAt(i) != xx.charAt(xlen - i - 1)) return false;

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1234321));
    }
}
