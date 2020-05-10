public class NewMergeSort {
    public static void MergeSoreByLoop(int[] array) {
        for (int gap = 1; gap < array.length; gap++) {
            for (int i = 0; i < array.length; i += 2*gap ) {
                int left = i;
                int mid = i + gap;
                int right = i + 2*gap;
                if (mid > array.length) {
                    mid = array.length;
                }
                if (right > array.length) {
                    right = array.length;
                }
                merge(array, left, mid, right);
            }
        }
    }
}
