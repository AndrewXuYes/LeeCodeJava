package LeeCode;

public class _14_longestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < ans.length() && j < strs[i].length()) {
                if (ans.charAt(j) != strs[i].charAt(j)) break;
                j++;
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) return "";
        }
        return ans;

    }

    public static void main(String[] args) {

        String[] moneyToStr = new String[]{"flower", "flow", "flight"};
        String[] moneyToStr2 = new String[]{"dog", "racecar", "car"};
        System.out.println("moneyToStr==" + longestCommonPrefix(moneyToStr));
        System.out.println("moneyToStr2==" + longestCommonPrefix(moneyToStr2));

    }
}
