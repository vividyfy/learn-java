public class solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast ==null || fast.next == null) {
            return false;
        }
        return true;
    }
}
