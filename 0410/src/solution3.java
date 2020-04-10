public class solution3 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur = newHead;
        int count = 0;
        while(cur1!=null||cur2!=null) {
            int x = cur1!=null?cur1.val:0;
            int y = cur2!=null?cur2.val:0;
            int sum = count + x + y;
            count = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(cur1!=null) {
                cur1 = cur1.next;
            }
            if(cur2!=null) {
                cur2 = cur2.next;
            }
        }
        if(count>0) {
            cur.next = new ListNode(count);
        }
        return newHead.next;
    }

}
