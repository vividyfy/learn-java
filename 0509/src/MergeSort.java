
import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int left, int right) {
        if (right-left<=1) {
            return;
        }
        int mid = (left + right)/2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        merge(array,left,mid,right);

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
        for (int i=0;i<right-left;i++) {
            array[left+i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {};
        //System.out.println(array.length);
        int[] arr = {1,7,2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
