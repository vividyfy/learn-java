import java.util.Arrays;

public class TestDemo {
    public static void swap(int[] array, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        int[] array2= {5,6,7,8,9};
        swap(array,array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
