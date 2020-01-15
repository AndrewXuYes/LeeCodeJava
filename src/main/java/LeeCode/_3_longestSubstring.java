package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class _3_longestSubstring {

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

    /**
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetcod/
     * <p>
     * 上述的方法最多需要执行 2n 个步骤。事实上，它可以被进一步优化为仅需要 n 个步骤。我们可以定义字符到索引的映射，而不是使用集合来判断一个字符是否存在。 当我们找到重复的字符时，我们可以立即跳过该窗口。
     * <p>
     * 也就是说，如果 s[j]s[j] 在 [i, j)[i,j) 范围内有与 j'j
     * ′
     * 重复的字符，我们不需要逐渐增加 ii 。 我们可以直接跳过 [i，j'][i，j
     * ′
     * ] 范围内的所有元素，并将 ii 变为 j' + 1j +1。
     */
    public static int lengthOfLongestSubstring22(String s) {
        int n = s.length(), max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) i = Math.max(map.get(s.charAt(j)), i);
            max = Math.max(max, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring22("abcabda"));//3
        System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(lengthOfLongestSubstring("au"));//2s
    }
}
