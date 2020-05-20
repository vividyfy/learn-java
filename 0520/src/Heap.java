import java.util.Arrays;

public class Heap {
    //向下转型
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

    public static void createHeap(int[] array, int size) {
        for (int i = (size - 1 - 1) / 2; i > 0; i--) {
            shiftDown(array, size, i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,8};
        createHeap(array, array.length);
        System.out.println(Arrays.toString(array));//大堆
    }

}
