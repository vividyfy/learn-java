public class MyStack2 {
    //使用链表也能实现栈，链表头表示栈顶，尾部表示栈底
    //只要知道头结点，就能获取所有结点
    //一般表示链表都是使用头结点来表示整个链表
    static class Node {
        public Node next;
        public int val;

        public Node(int val) {
            this.val = val;
        }
    }


    Node head = new Node(-1);

    //入栈
    public void push(int value) {
        //头插
        Node node = new Node(value);
        node.next = head.next;
        head.next = node;

    }

    //出栈
    public Integer pop() {

        Node cur = head.next;
        if (cur == null) {
            return null;
        }
        head.next = cur.next;
        return cur.val;
    }

    //取栈顶元素
    public Integer peek() {
        Node cur = head.next;
        if (cur==null) {
            return null;
        }
        return cur.val;
    }

    public static void main(String[] args) {
        MyStack2 myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.push(2);


    }
}
