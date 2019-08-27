package LeeCode;

import java.math.BigDecimal;

public class _43_multiply {
    /**
     * 输入: num1 = "2", num2 = "3"
     * 输出: "6"
     * 示例 2:
     * <p>
     * 输入: num1 = "123", num2 = "456"
     * 输出: "56088"
     */

    public static String multiply(String num1, String num2) {
        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);
        BigDecimal bigDecimal3 = bigDecimal1.multiply(bigDecimal2);
        return bigDecimal3.toString();
    }

    public static String multiply2(String num1, String num2) {
        return String.valueOf(Long.parseLong(num1) * Long.parseLong(num2));
    }

    public static String multiply3(String num1, String num2) {

        int num1len = num1.length();
        int num2len = num2.length();

        if (num1len == 0 || num2len == 0) return "";

        int[] mul = new int[num1len + num2len];
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = num1len - 1; i >= 0; i--) {
            for (int j = num2len - 1; j >= 0; j--) {
                int bitmul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                bitmul += mul[i + j + 1]; // 先加低位判断是否有新的进位
                mul[i + j] += bitmul / 10;
                mul[i + j + 1] = bitmul % 10;
            }
        }

        int i = 0;
        while (i < mul.length - 1 && mul[i] == 0) i++;
        while (i < mul.length) stringBuilder.append(mul[i++]);

        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println("multiply==" + multiply("12", "12"));
        System.out.println("multiply2==" + multiply2("12", "12"));
        System.out.println("multiply3==" + multiply3("12", "12"));

    }
}
