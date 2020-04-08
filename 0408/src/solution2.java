public class solution2 {
    public boolean isPalindrome(ListNode head) {
        if(head==null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast!=null) {
            slow = slow.next;
        }
        ListNode pre = null;
        while (slow!=null) {
            ListNode tmp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = tmp;
        }
        while (head!=null&&pre!=null) {
            if (head.val!=pre.val) {
                return false;
            }
            head = head.next;
            pre = pre.next;
        }

        return true;
    }
}
