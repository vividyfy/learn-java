import java.util.Arrays;
//数组内的数字排列
public class TestDemo2 {
    public static void swap(int[] array) {
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,9,8,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
}
