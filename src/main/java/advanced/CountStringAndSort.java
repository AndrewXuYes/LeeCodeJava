package advanced;

import java.util.*;

public class CountStringAndSort {
    //统计字符串字母出现次数，从大到小输出
    //eg：aaabbc ; sout:a:3,b:2,c:1

    public static String CountStringAndSort(String str) {
        System.out.println("str==" + str);
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), ++count);
            } else hashMap.put(str.charAt(i), 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (int) o1.getValue() - (int) o2.getValue();
            }
        });

        return list + "";
    }

    public static void main(String[] args) {
        System.out.println(CountStringAndSort("aafsfdadsdabbc"));
    }
}
