public class MyPriorityQueueMinHeap {
    private int[] array = new int[100];
    public int size = 0;

    public void offer(int x) {
        array[size] = x;
        size++;
        shiftUp(array, size, size - 1);
    }

    private void shiftUp(int[] array, int size, int index) {
        int child = index;
        int parent =(index - 1) / 2;
        while (child > 0) {
            if (array[child] < array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            } else {
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }
    //出队列
    public Integer poll() {
        if (size <= 0) {
            return null;
        }
        int ret = array[0];
        array[0] = array[size-1];
        size--;
        shiftDown(array, size, 0);
        return ret;
    }

    private void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && array[child] > array[child+1]) {
                child = child + 1;
            }
            if (array[parent] > array[child]) {
                int tmp =  array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public Integer peek() {
        if (size <= 0) {
            return null;
        }
        return array[0];
    }
    public boolean isEmpty() {
        return size==0;
    }

    public static void main(String[] args) {
        MyPriorityQueueMinHeap myPriorityQueue = new MyPriorityQueueMinHeap();
        myPriorityQueue.offer(9);
        myPriorityQueue.offer(5);
        myPriorityQueue.offer(2);
        myPriorityQueue.offer(7);
        myPriorityQueue.offer(3);
        myPriorityQueue.offer(6);
        myPriorityQueue.offer(8);
        while (!myPriorityQueue.isEmpty()) {
            Integer cur = myPriorityQueue.poll();
            System.out.println(cur);
        }

    }
}
