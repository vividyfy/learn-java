class ListNode {
    public ListNode prev;
    public ListNode next;
    public int val;
    public ListNode(int val) {
        this.val = val;
    }
}
public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;
    //头插法    
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head==null && this.last==null) {
            this.head = node;
            this.last = null;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    //尾插法    
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head==null) {
            this.head = node;
            this.last = null;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }
    public void checkIndex(int index) {
        if (index<0 || index>size()) {
            throw new RuntimeException("index位置不合法！");
        }
    }
    //任意位置插入,第一个数据节点为0号下标    
    public void addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        checkIndex(index);
        if (index==0) {
            addFirst(data);
            return;
        }
        if (index==size()) {
            addLast(data);
            return;
        }
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        node.prev.next = node;
    }
    //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur!=null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点    
    public void remove(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点    
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }

    }
    //得到单链表的长度    
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
    }
    public void clear() {
        this.head = null;
        this.last = null;
    }
}
