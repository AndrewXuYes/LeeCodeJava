import LeeCode.AddTwoNumbers;
import Utils.Sout;

class Main {

    /***
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807

     */
    public static void main(String[] args) {
        AddTwoNumbers.ListNode listNode = new AddTwoNumbers.ListNode(2);
        listNode.setNext(new AddTwoNumbers.ListNode(4));
        listNode.setNext(new AddTwoNumbers.ListNode(3));

        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);
        listNode2.setNext(new AddTwoNumbers.ListNode(6));
        listNode2.setNext(new AddTwoNumbers.ListNode(5));

        Sout.soutNum(AddTwoNumbers.addTwoNumbers(listNode, listNode2));
        //0没了？
    }
}
