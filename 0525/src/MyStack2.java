public class MyStack2 {
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
        head.next = cur;
    }

    public Integer pop() {
        Node toDelete = head.next;
        if (toDelete==null) {
            return null;
        }
        head.next = toDelete.next;
        return toDelete.val;
    }

    public Integer peek() {
        if (head==null) {
            return null;
        }
        return head.next.val;
    }

    public static void main(String[] args) {
        MyStack2 myStack2 = new MyStack2();
        myStack2.push(9);
        myStack2.push(5);
        myStack2.push(2);
        myStack2.push(7);
        while (true) {
            Integer cur = myStack2.pop();
            if (cur==null) {
                break;
            }
            System.out.println(cur);
        }

    }
}
