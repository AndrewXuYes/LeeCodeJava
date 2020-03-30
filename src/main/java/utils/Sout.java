package utils;

import java.util.List;

public class Sout {

    public static void soutNum(List num) {
        num.forEach(item -> {
            System.out.print(item + " ");
        });
        System.out.println();
    }

    public static void soutNum(int[] num) {
        for (int item : num) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
