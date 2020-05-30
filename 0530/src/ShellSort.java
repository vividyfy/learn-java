public class ShellSort {
    public static void shellSort(int[] array) {
        int gap = array.length/2;
        while (gap > 1) {
            insortSortGap(array,gap);
            gap = gap/2;
        }
        insortSortGap(array,1);
    }

    private static void insortSortGap(int[] array, int gap) {
        for (int bound = gap; bound < array.length; bound++) {
            int tmp = array[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur--) {
                if (array[cur] > tmp) {
                    array[cur + gap] = array[cur];
                } else {
                    break;
                }
            }
            array[cur + gap] = tmp;
        }
    }
}
