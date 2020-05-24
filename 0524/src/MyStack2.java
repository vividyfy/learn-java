public class MyStack2 {
    //链表实现栈
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

    }
    Node head = new Node(-1);

    public void push(int val) {
        Node cur = new Node(val);
        cur.next = head.next;
        head = cur;
    }

    public Integer pop() {
        Node toDelete = head.next;
        if (head==null) {
            return null;
        }
        head.next = toDelete.next;
        return toDelete.val;
    }

    public Integer peek() {
        if (head.next==null) {
            return null;
        }
        return head.next.val;
    }
}
