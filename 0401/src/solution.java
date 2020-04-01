public class solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pL = headA;
        ListNode pS = headB;
        if(pL==pS) {
            return headB;
        }
        int lenA = 0;
        int lenB = 0;
        if(pL==null||pS==null) {
            return null;
        }
        while(pL!=null) {
            lenA++;
            pL = pL.next;
        }
        while(pS!=null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        if(lenA > lenB) {
            int m = lenA - lenB;
            for(int i = 0;i < m;i++) {
                pL = pL.next;
            }
        }else if(lenB>lenA){
            int n = lenB - lenA;
            for(int i = 0;i < n;i++) {
                pS = pS.next;
            }
        }

        while(pL!=null&&pS!=null) {
            while(pL==pS) {
                return pL;
            }
            pL = pL.next;
            pS = pS.next;
        }
        return null;
    }
}
