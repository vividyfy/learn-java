import java.util.Scanner;

public class TestDemo2 {
    public static int avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        //int[] array = {1,2,3,4,5};
        System.out.println(avg(array));
    }
}


