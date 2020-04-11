public class solution2 {
    public ListNode partition(ListNode head, int x) {

        ListNode bs = null,be = null, ls = null, le = null,cur = head;

        while(cur!=null) {
            if(cur.val<x) {
                if(bs==null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if(ls==null) {
                    ls = cur;
                    le = cur;
                }else {
                    le.next = cur;
                    le = le.next;
                }
            }
            cur = cur.next;
        }

        if(bs==null) {
            return ls;
        }
        if(le==null) {
            return bs;
        }
        be.next = ls;
        if(ls!=null) {
            le.next = null;
        }

        return bs;
    }
}
