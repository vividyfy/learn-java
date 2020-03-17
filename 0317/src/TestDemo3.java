public class TestDemo3 {
    public static boolean isSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,5,9,8,3};
        System.out.println(isSort(array));
    }
}
