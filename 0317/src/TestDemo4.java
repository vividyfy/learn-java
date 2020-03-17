import java.util.Arrays;

public class TestDemo4 {
    public static void copyOf(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,8};
        copyOf(array);
    }
}
