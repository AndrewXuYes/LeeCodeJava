package LeeCode;

public class _415_addStrings {
    public static String addStrings(String num1, String num2) {
        int num1len = num1.length();
        int num2len = num2.length();
        int flag = 0;
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = num1len - 1, j = num2len - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = 0;
            sum = (i >= 0 ? num1.charAt(i) - '0' : 0) + (j >= 0 ? num2.charAt(j) - '0' : 0) + flag;
            flag = sum / 10;
            stringBuilder.append(sum);
        }
        return stringBuilder.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(addStrings("122", "32"));
        System.out.println(addStrings("9", "99"));

    }
}
