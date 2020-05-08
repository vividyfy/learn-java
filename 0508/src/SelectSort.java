import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] array) {
        for (int bound=0;bound<array.length;bound++) {
            for (int cur = bound;cur < array.length;cur++) {
                if (array[cur]<array[bound]) {
                    swap(array,cur,bound);
                }
            }
        }
    }
    public static void swap(int[] array,int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,3,4,5,6};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
