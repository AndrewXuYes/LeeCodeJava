package LeeCode;

public class _24_swapPairs {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // 三个节点顺序:head, next, swapPairs(next.next)
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;

    }

    public static void main(String[] args) {

    }
}
