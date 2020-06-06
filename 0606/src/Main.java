
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int A = (a + c) / 2;
        int B = (b + d) / 2;
        int C = (d - b) / 2;
        if ( (a - c) % 2 == 0 && (a + c) %2 == 0 && (b + d) % 2 == 0 && A - B == a &&
         B - C == b && A + B == c && B + C == d ) {
            System.out.println(A + " " + B + " " + C);
        } else {
            System.out.println("NO");
        }
    }
}
