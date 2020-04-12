public class solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0;
        int b=0;
        ListNode cur1 = headA;
        ListNode cur2 = headB;
        while(cur1!=null) {
            a++;
            cur1 = cur1.next;
        }
        while(cur2!=null) {
            b++;
            cur2 = cur2.next;
        }
        cur1 = headA;
        cur2 = headB;
        if(a>b) {
            for(int i=0;i<a-b;i++) {
                cur1 = cur1.next;
            }
            while(cur1!=null&&cur2!=null) {
                if(cur1==cur2) {
                    return cur1;
                }
                cur1 = cur1.next;
                cur2 = cur2.next;

            }
        }else {
            for(int i=0;i<b-a;i++) {
                cur2 = cur2.next;
            }
            while(cur1!=null&&cur2!=null) {
                if(cur1==cur2) {
                    return cur1;
                }
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}
