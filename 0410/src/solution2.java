public class solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        int count = 0;
        while(cur!=null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        if(count == n) {
            head = head.next;
            return head;
        }
        for(int i=0;i<n;i++) {
            fast = fast.next;
        }
        fast = fast.next;
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode del = slow.next;
        slow.next = del.next;
        return head;
    }
}
