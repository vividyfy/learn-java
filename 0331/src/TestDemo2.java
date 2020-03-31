class Solution {
    public Node reverseList(Node head) {
        Node cur = head;
        Node newHead = null;
        Node prev = null;
        while (cur!=null) {
            Node curNext = cur.next;
            if (curNext==null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}
public class TestDemo2 {
}
