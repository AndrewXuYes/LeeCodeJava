package leecode;

import lombok.Data;

public class _19_removeNthFromEnd {

    @Data
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void soutNum(ListNode num) {
        if (num != null) {
            while (num.next != null) {
                System.out.print(num.getVal() + "->");
                num = num.next;
            }
            System.out.print(num.getVal());
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode111 = new ListNode(3);
        listNode1.setNext(listNode11);
        listNode11.setNext(listNode111);

        soutNum(removeNthFromEnd(listNode1, 3));
    }

}
