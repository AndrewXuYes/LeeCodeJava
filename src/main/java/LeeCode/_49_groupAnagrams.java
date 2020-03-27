package LeeCode;

import java.util.*;

public class _49_groupAnagrams {

    /**
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     * <p>
     * 示例:
     * <p>
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     * ["ate","eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     *
     * @return
     */


    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] char1 = str.toCharArray();
            Arrays.sort(char1);
            String key = String.valueOf(char1);
            if (hashMap.containsKey(key)) hashMap.get(key).add(str);
            else hashMap.put(key, new ArrayList<>(Arrays.asList(str)));
        }
        return new ArrayList<>(hashMap.values());
    }


    public static void main(String[] args) {
        System.out.println("groupAnagrams");
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
