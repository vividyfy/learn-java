public class Solution {
    public Node FindKthToTail(Node head,int k) {
        if(head == null) {
            return null;
        }
        Node cur = head;
        int count = 0;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        if(k>count) {
            return null;
        }
        if(k<=0) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for(int i=0;i<k-1;i++) {
            if(fast.next != null){
                fast = fast.next;
            }else {
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
public class TestDemo3 {
}
