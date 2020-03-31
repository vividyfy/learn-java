public class solution {
    public Node deleteDuplication(Node pHead)
    {
        Node cur = pHead;
        Node node = new Node(-1);
        Node tmp = node;
        if (pHead==null) {
            return null;
        }
        while (cur!=null) {
            if (cur.next!=null&&cur.data == cur.next.data) {
                while (cur.next!=null&&cur.data==cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return node.next;
    }
}
