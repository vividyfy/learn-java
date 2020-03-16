import java.util.Arrays;

public class TestDemo3 {
    //java内置排序
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 7, 8, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    //优化
    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(flg = false) {
                return;
            }
        }
    }
    public static void main2(String[] args) {
        int[] array = {1, 5, 3, 6, 7, 8, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {1, 5, 3, 6, 7, 8, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
