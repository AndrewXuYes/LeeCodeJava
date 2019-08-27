package LeeCode;

import java.util.HashMap;

public class _5_LengthOfLongestSubstring {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1:
     * 输入: "abcabcbb"
     * 输出: 3
     * <p>
     * 示例 2:
     * 输入: "bbbbb"
     * 输出: 1
     * <p>
     * 示例 3:
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3，请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

    public static int lengthOfLongestSubstring(String s) {
        //滑动窗口，利用hashmap去重
        if (s.length() < 1) return 0;

        int slen = s.length();
        int max = 1;

        for (int i = 0; i < slen; i++) {
            HashMap<Character, String> hashMap = new HashMap<Character, String>();
            int flag = i;
            for (int j = i; j < slen; j++, flag++) {
                if (hashMap.containsKey(s.charAt(j))) {
                    max = Math.max(max, (flag - j));
                    break;
                } else {
                    hashMap.put(s.charAt(j), "");
                    flag++;
                }
            }

        }
        return max;
    }
}
