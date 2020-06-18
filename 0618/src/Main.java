import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == m) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}
