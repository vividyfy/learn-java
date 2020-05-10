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
    private static void merge(int[] array, int left, int mid, int right) {
        int cur1 = left;
        int cur2 = mid;
        int[] tmp = new int[right-left];
        int index = 0;
        while (cur1<mid&&cur2<right) {
            if (array[cur1] <= array[cur2]) {
                tmp[index] = array[cur1];
                cur1++;
                index++;
            } else {
                tmp[index] = array[cur2];
                cur2++;
                index++;
            }
        }
        while (cur1<mid) {
            tmp[index] = array[cur1];
            cur1++;
            index++;
        }
        while (cur2<right) {
            tmp[index] = array[cur2];
            cur2++;
            index++;
        }
        for (int i=0;i<index;i++) {
            array[left+i] = tmp[i];
        }
    }
}
