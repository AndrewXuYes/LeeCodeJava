package Advanced;

import java.util.Map;
import java.util.TreeMap;

public class CountStringAndSort {
    //统计字符串字母出现次数，从大到小输出
    //eg：aaabbc ; sout:a:3,b:2,c:1

    public static String CountStringAndSort(String str) {
        System.out.println("str==" + str);
        Map<Character, Integer> hashMap = new TreeMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                int count = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), ++count);
            } else
                hashMap.put(str.charAt(i), 1);

        }

//      List<Map.Entry<Character, Integer>> list = new ArrayList<>(hashMap.entrySet());
//        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> m, Map.Entry<Character, Integer> n) {
//                return n.getValue() - m.getValue();
//            }
//        });

        // String b = list.toString().replace("=", ":").replace("[", "").replace("]", "").replace(",", ";").replace(" ","");
        System.out.println(hashMap + ";");
        return hashMap + "";
    }

    public static void main(String[] args) {
        CountStringAndSort("aafsfdadsdabbc");
    }
}
