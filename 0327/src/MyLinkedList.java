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
    public MyLinkedList() {
        this.head = null;
    }

    //头插法    
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head==null) {
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
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void checkIndex(int index) {
        if (index < 0 || index >size()) {
            throw new RuntimeException("index不合法");
        }
    }
    public void addIndex(int index,int data) {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        //1、找到
        Node prev = findIndex(index);
        //2、
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
    }
    //找到index-1步的引用
    private Node findIndex(int index) {
        Node cur = this.head;
        int count = 0;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data==key) {
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
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
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
        this.head = null;
    }
}