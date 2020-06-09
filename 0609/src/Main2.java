import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String[] str = s1.split(" ");
            int[] array = new int[str.length - 1];
            for (int i = 0; i < str.length - 1; i++) {
            array[i] = Integer.parseInt(str[i]);
            }
            int k = Integer.parseInt(str[str.length-1]);
            Arrays.sort(array);
            for (int i = 0; i < k; i++) {
                System.out.print(array[i]);
                if (i < k - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
