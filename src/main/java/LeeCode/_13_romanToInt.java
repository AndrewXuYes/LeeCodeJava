package LeeCode;

public class _13_romanToInt {

    public static int romanToInt(String s) {
        int[] moneys = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] moneyToStr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int sum = 0;
        while (s.length() > 0) {
            for (int i = 0; i < moneyToStr.length; i++) {
                if (s.startsWith(moneyToStr[i])) {
                    s = s.substring(moneyToStr[i].length());
                    sum += moneys[i];
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("III==" + romanToInt("III"));
        System.out.println("IV==" + romanToInt("IV"));
        System.out.println("IX==" + romanToInt("IX"));
        System.out.println("LVIII==" + romanToInt("LVIII"));
        System.out.println("MCMXCIV==" + romanToInt("MCMXCIV"));

    }

}
