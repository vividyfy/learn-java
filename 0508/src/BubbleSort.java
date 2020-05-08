import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++){
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {2,6,5,1,3,4,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
