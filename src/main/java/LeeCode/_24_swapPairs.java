package LeeCode;

public class _24_swapPairs {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        // 三个节点顺序:head, next, swapPairs(next.next)
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;

    }


    public static ListNode swapPairs2(ListNode head) {
        //pre用来返回头指针
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            //交换
            temp.next = end;
            start.next = end.next;
            end.next = start;
            //从temp.next开始
            temp = start;
        }
        return pre.next;
    }


}
