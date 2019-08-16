package Utils;

import LeeCode.AddTwoNumbers;

import java.util.List;

public class Sout {


    public static void soutNum(List<String> num) {
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

    public static void soutNum(AddTwoNumbers.ListNode num) {
        while (num != null) {
            System.out.print(num.getVal());
            num = num.getNext();
        }
        System.out.println();
    }

}
