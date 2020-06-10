import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n;
        int count = 0;
        while (m > 0) {
            m = m / 10;
            count++;
        }
        String[] strs = new String[count];
        int a = 0;
        while (n > 0) {
            strs[a] = String.valueOf(n % 10);
            a++;
            n = n / 10;
        }
        int b = 0;
        for (int i = 0; i < strs.length; i++) {
            b = Integer.parseInt(strs[i]);
            System.out.print(b);
        }
    }
}
