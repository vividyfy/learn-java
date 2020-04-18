public class MyQueue {
    //实现队列链表和顺序表都可以
    //链表更简单  链表尾部作为队尾（方便插入），链表头部作为队首（方便删除）
    //插入元素无上限，效率低
     static class Node {
         public int val;
         public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = new Node(-1);
     Node tail = head;

     //入队列 尾插
    public void offer(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
    }

    //出队列  头删
    public Integer poll() {
        if (head.next==null) {
            return null;
        }
        Node cur = head.next;
        head.next = cur.next;
        if (head.next==null) {
            tail = head;
        }
        return cur.val;

    }

    //取队首元素
    public Integer Peek() {
        if (head.next==null) {
            return null;
        }
        return head.next.val;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        while (true) {
            Integer cur = queue.poll();
            if (cur==null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
