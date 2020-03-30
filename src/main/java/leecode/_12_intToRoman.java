package leecode;

public class _12_intToRoman {

    public static String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] moneys = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] moneyToStr = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        while (num > 0) {
            if (num >= moneys[index]) {
                stringBuilder.append(moneyToStr[index]);
                num -= moneys[index];
                index--;
            }
            index++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("3==" + intToRoman(3));
        System.out.println("4==" + intToRoman(4));
        System.out.println("9==" + intToRoman(9));
        System.out.println("58==" + intToRoman(58));
        System.out.println("1994==" + intToRoman(1994));
    }
}
