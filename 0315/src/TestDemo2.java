public class TestDemo2 {
    public static int binarySearch(int[] array, int num) {
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = (left+right);
            if(num > array[mid]) {
                left = mid + 1;
            }else if(num < array[mid]) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(binarySearch(array,2));
    }
}
