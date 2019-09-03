package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class _3_LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) return 0;
        int slen = s.length(), max = 1;

        for (int i = 0; i < slen; i++) {
            HashMap<Character, String> hashMap = new HashMap<Character, String>();
            for (int j = i; j < slen; j++) {
                if (hashMap.containsKey(s.charAt(j))) break;
                else hashMap.put(s.charAt(j), "");
            }
            max = Math.max(max, hashMap.size());
        }
        return max;
    }

    public int lengthOfLongestSubstring22(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(lengthOfLongestSubstring("au"));//2s
    }
}
