import Utils.Sout;

import static LeeCode.AddTwoNumbers.ListNode;
import static LeeCode.AddTwoNumbers.addTwoNumbers;

class Main {

    /***
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807

     */
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode111 = new ListNode(3);
        listNode1.setNext(listNode11);
        listNode11.setNext(listNode111);

        ListNode listNode2 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        ListNode listNode222 = new ListNode(4);
        listNode2.setNext(listNode22);
        listNode22.setNext(listNode222);

        Sout.soutNum(addTwoNumbers(listNode1, listNode2));
        //0没了？
    }
}
