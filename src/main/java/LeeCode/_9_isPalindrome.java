package LeeCode;

import cn.hutool.core.convert.Convert;

public class _9_isPalindrome {
    public static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        String xx = Convert.toStr(x);
        int xlen = xx.length();
        for (int i = 0; i < xlen / 2; i++)
            if (xx.charAt(i) != xx.charAt(xlen - i - 1)) return false;
        return true;
    }

    public static boolean isPalindrome3(int x) {
        StringBuilder stringBuilder = new StringBuilder(x + "");
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public static boolean isPalindrome(int x) {
        //思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1230321));
    }
}
