package LeeCode;

import Utils.Sout;
import lombok.Data;

import java.util.Stack;

public class _2_addTwoNumbers {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 示例：
     * <p>
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */

    @Data
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static void soutNum(_2_addTwoNumbers.ListNode num) {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            p = p != null ? p.next : null;
            q = q != null ? q.next : null;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

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

        soutNum(addTwoNumbers(listNode1, listNode2));
    }


}
