import java.util.Arrays;

public class solution {
    public static int findKth(int[] a, int n, int K) {
        quickSort(a);
        return a[K-1];
    }

    private static void quickSort(int[] a) {
        quickSortHelper(a,0, a.length-1);
    }


    private static void quickSortHelper(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partition(a,left,right);
        quickSortHelper(a, left, index - 1);
        quickSortHelper(a, index+1, right);

    }

    private static int partition(int[] a, int left, int right) {
        int baseValue = a[right], i = left, j = right;
        while (i < j) {


            while (i < j && a[j] <= baseValue) {
                j--;
            }

            while (i < j && a[i] >= baseValue) {
                i++;
            }

            if (i < j) {
                swap(a,i,j);
            }
        }
        swap(a,i,right);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,7,3,6,8};
        System.out.println(Arrays.toString(arr));
    }
}
