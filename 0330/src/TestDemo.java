class Solution {
    public Node removeElements(Node head, int val) {
        if (head==null) {
            return null;
        }
        Node cur = head.next;
        Node prev = head;
        while (cur!=null) {
            if (cur.data==val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.data == val) {
            head = head.next;
        }
        return head;
    }
}
