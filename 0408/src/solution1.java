public class solution1 {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int a = 0;
        while(cur!=null) {
            a = a*2+cur.val;
            cur = cur.next;
        }
        return a;
    }
}
