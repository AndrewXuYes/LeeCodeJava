import Advanced.LRUMap;

import java.text.ParseException;

class Main {
    public static void main(String[] args) throws ParseException {


        LRUMap<String, Integer> lruMap = new LRUMap(3);
        lruMap.put("1", 1);
        lruMap.put("2", 2);
        lruMap.put("3", 3);

        System.out.println(lruMap.toString());

        lruMap.put("4", 4);
        System.out.println(lruMap.toString());

        lruMap.put("5", 5);
        lruMap.put("5", 5);
        lruMap.put("3", 3);
        System.out.println(lruMap.toString());

    }
}
