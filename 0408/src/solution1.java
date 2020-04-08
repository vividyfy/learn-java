public class solution1 {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode slow = head;
        while(slow!=null) {
            ListNode fast =slow;
            while(fast.next!=null){
                if (fast.next.val == slow.val) {
                    fast.next = fast.next.next;
                }else {
                    fast = fast.next;
                }
            }
            slow = slow.next;

        }
        return head;
    }
}
