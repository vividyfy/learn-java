import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] array) {
        int gap = array.length/2;
        while(gap>1) {
            insertSortGap(array,gap);
            gap = gap / 2;
        }
        insertSortGap(array,1);
    }

    private static void insertSortGap(int[] array, int gap) {
        for (int bound=0;bound<array.length;bound++) {
            int tmp = array[bound];
            int cur = bound - gap;
            for (;cur>=0;cur-=gap) {
                if (array[cur]>tmp) {
                    array[cur+gap] = array[cur];
                } else {
                    break;
                }
            }
            array[cur+gap] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,8,9,6};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
