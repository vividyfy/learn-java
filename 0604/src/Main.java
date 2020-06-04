import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = n % 8;
        int y = n / 8;
        if (n < 6) {
            System.out.println(-1);
        } else if (x == 0) {
            System.out.println(n / 8);
        } else if ((x != 0) && ((x % 6 == 0))) {
            System.out.println(y + x / 6);
        } else if (y != 0 && (x + 8 ) % 6 ==0) {
            System.out.println(y - 1 + (x + 8) / 6);
        }
        else {
            System.out.println(-1);
        }
    }
}
