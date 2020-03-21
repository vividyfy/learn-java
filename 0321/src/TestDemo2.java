import java.util.Arrays;

public class TestDemo2 {
    public static void func(int[] array) {
        int left = 0;
        int right = array.length-1;
        int tmp = 0;
        while (left<right && array[left]%2 ==0) {
            left++;
        }
        while (left<right && array[right]%2 != 0) {
            right--;
        }
        tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        func(array);
        System.out.println(Arrays.toString(array));
    }
}
