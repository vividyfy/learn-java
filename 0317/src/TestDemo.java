import java.util.Arrays;
public class TestDemo {
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,9,10};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
