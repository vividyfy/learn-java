public class TestDemo2 {
    public static int findNum(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,4,5,5,8};
        System.out.println(findNum(array));
    }
}
