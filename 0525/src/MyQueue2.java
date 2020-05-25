public class MyQueue2 {
    //数组实现队列
    private int[] array = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public boolean offer(int val) {
        if (size == array.length) {
            return false;
        }
        array[tail] = val;
        size++;
        if (tail>array.length) {
            tail = 0;
        }
        size++;
        return true;
    }

    public Integer poll() {
        if (size == 0) {
            return null;
        }
        int ret = array[head];
        if (head>=array.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[head];
    }
}
