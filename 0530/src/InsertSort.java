public class InsertSort {
    public static void insertSort(int[] array) {
        for (int bound = 1; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound - 1;
            for (;cur >= 0;cur--) {
                if (array[cur] > tmp) {
                    array[cur+1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur+1] = tmp;
        }
    }
}
