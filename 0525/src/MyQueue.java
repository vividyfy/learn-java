public class MyQueue {
    //链表尾部作为队尾，头部作为队首
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head = new Node(-1);
    Node tail = head;

    //入队列(尾插)
    public void offer(int val) {
        Node cur = new Node(val);
        tail.next = cur;
        tail = tail.next;
    }

    //出队列(头删)
    public Integer poll() {
        Node toDelete = head.next;
        if (toDelete == null) {
            //队列为空，出队列失败
            return null;
        }
        head.next = toDelete.next;
        if (head.next == null) {
            tail = head;
        }
        return toDelete.val;

    }

    //取队首元素
    public Integer peek() {
        if (head.next == null) {
            return null;
        }
        return head.next.val;
    }



    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(9);
        myQueue.offer(5);
        myQueue.offer(2);
        myQueue.offer(7);
        myQueue.offer(3);
        while (true) {
            Integer cur =myQueue.poll();
            if (cur==null) {
                break;
            }
            System.out.println(cur);
        }

    }
}