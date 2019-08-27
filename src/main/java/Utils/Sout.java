package Utils;

import LeeCode._2_AddTwoNumbers;

import java.util.List;
import java.util.Stack;

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

    public static void soutNum(_2_AddTwoNumbers.ListNode num) {
        Stack stack = new Stack();
        while (num != null) {
            stack.push(num.getVal());
            num = num.getNext();
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

}
