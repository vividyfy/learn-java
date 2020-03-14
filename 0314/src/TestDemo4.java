import java.util.Arrays;

public class TestDemo4 {
    public static int[] transform(int[] array) {
        int[] ret = array;
        for (int i = 0; i < ret.length; i++) {
            ret[i] = ret[i]*2;
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array ={2,6,5,3,8,9,1};
        System.out.println(Arrays.toString(transform(array)));
    }
}
