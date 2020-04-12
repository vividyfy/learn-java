public class solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode cur = head;
        ListNode prev = newHead;
        while(cur!=null) {
            ListNode tmp = cur.next;
            while(prev.next!=null&&prev.next.val<cur.val) {
                prev = prev.next;
            }
            cur.next = prev.next;
            prev.next = cur;
            prev = newHead;
            cur = tmp;
        }
        return newHead.next;
    }
}
