import java.util.Arrays;

public class TestDemo4 {
    //数组的几种拷贝方式。
    //1、for循环拷贝
    public static int[] copyFor(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = copyFor(array);
        System.out.println(Arrays.toString(array2));

        //2、System.arraycopy
        int[] array3 = {4, 5, 6};
        int[] dest = new int[array3.length];
        System.arraycopy(array3, 0, dest, 0, array3.length);
        System.out.println(Arrays.toString(dest));

        //3、Arrays.copyOf
        int[] array4 = {7, 8, 9};
        int[] ret = Arrays.copyOf(array4, array4.length);
        System.out.println(Arrays.toString(ret));

        //4、array.clone
        int[] array5 = {10, 11, 12};
        int[] ret2 = array5.clone();
        System.out.println(Arrays.toString(ret2));
    }
}
