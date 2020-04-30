public class TestDemo {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > v; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = v;
        }
    }
}
