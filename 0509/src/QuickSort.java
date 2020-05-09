import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSortHelper(array,0,array.length-1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left>=right) {
            return;
        }
        int index = partition(array,left,right);
        quickSortHelper(array,left,index-1);
        quickSortHelper(array,index+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int baseValue = array[right];
        int i = left;
        int j = right;
        while (i<j) {
            while (i<j&&array[i]<=baseValue) {
                i++;
            }
            while (i<j&&array[j]>=baseValue) {
                j--;
            }
            if (i<j) {
                swap(array,i,j);
            }
        }
        swap(array,i,right);
        return i;
    }
    private static void swap(int[] array, int cur, int bound) {
        int tmp = array[cur];
        array[cur] = array[bound];
        array[bound] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {8,5,9,7,3,1};
        Arrays.sort(array);
        //quickSort(array);
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(0);
        arr.add(9);
        arr.add(2);
        arr.add(5);
        arr.add(8);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(Arrays.toString(array));
    }
}
