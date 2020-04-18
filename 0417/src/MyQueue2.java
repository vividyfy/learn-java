public class MyQueue2 {
    //顺序表
    //插入元素有上限  效率更高
    public int[] array = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //插入失败，返回false
    public boolean offer(int value) {
        if (size==array.length) {
            return false;
        }
        array[tail] = value;
        tail++;
        if(tail>=array.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    public Integer poll() {
        if (size==0) {
            return null;
        }
        int ret = array[head];
        head++;
        if (head>=array.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek() {
        if(size==0) {
            return null;
        }
        return array[head];
    }

    public static void main(String[] args) {
        MyQueue2 queue2 = new MyQueue2();
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);
        while (true) {
            Integer cur = queue2.poll();
            if (cur==null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
