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


    public static void main(String[] args) {
        System.out.println(multiply("12", "32"));
    }
}
