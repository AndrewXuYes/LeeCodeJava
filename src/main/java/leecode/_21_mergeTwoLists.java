package leecode;

import lombok.Data;

public class _21_mergeTwoLists {

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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.getVal() < l2.getVal()) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode11 = new ListNode(3);
        ListNode listNode111 = new ListNode(5);
        listNode1.setNext(listNode11);
        listNode11.setNext(listNode111);

        ListNode listNode2 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode222 = new ListNode(4);
        listNode2.setNext(listNode22);
        listNode22.setNext(listNode222);

        soutNum(mergeTwoLists(listNode1, listNode2));

    }
}
