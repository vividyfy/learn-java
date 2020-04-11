public class solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = newHead.next;
        ListNode prev = newHead;
        int count = 0;
        while(count < m-1) {
            cur = cur.next;
            prev = prev.next;
            count++;
        }


        for(int i=0; i < n - m; i++) {
            ListNode remove = cur.next;
            cur.next = cur.next.next;
            remove.next = prev.next;
            prev.next = remove;
        }
        return newHead.next;
    }
}
