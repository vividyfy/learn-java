import java.util.Arrays;
import java.util.Stack;

public class NewQuickSort {
    public static void quickSortByLoop(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(array.length-1);
        while (!stack.empty()) {
            int right = stack.pop();
            int left = stack.pop();
            if (left>=right) {
                continue;
            }
            int index = partition(array,left,right);
            stack.push(index+1);
            stack.push(right);
            stack.push(left);
            stack.push(index-1);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int baseValue = array[right];
        int i = left;
        int j = right;
        while (i<j) {
            while (i < j && array[i]<= baseValue) {
                i++;
            }
            while (i < j && array[j] >= baseValue) {
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
        int[] array = {9,5,2,7,3,6,8};
        quickSortByLoop(array);
        System.out.println(Arrays.toString(array));
    }
}
