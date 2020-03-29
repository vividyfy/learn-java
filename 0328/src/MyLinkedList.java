class Node {
    public Node next;
    public int data;
    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法    
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head==null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next!=null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标    
    public void
    addIndex(int index,int data) {
        if (index<0||index>size()) {
            throw new RuntimeException("index位置不合法！");
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node prev = findIndex(index);
        node.next = prev.next;
        prev.next = node;

    }
    private Node findIndex(int index) {
        Node cur = this.head;
        int count = 0;
        while (count<index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点    
    public void remove(int key) {
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findIndex(key);
        if (prev == null) {
            System.out.println("没有找到这个节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }
    //删除所有值为key的节点    
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //得到单链表的长度    
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
    public void clear() {
        Node cur = this.head;
        while (cur != null) {
            cur = null;
            cur = cur.next;
        }
    }
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp =  newHead;
        //1、当两个单链表都不为空的时候
        while (headA!=null && headB!=null) {
            if ()
        }

        //2、第一步完成后   其中一个单链表不为空  一个为空

        return newHead.next;
    }

}
