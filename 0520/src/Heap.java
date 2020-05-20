public class Heap {
    public static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (array[child] < array[child+1] && child + 1 < size) {
                child = child + 1;
            }
            if (array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    
}
