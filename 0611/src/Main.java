import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0, i = 1;
        while (true) {
            f = fib(i);
            if (f == n) {
                System.out.println(0);
            }
            if (f > n) {
                int m = f - n;
                int f2 = fib(i-1);
                int m2 = n - f2;
                if (m < m2) {
                    System.out.println(m);
                } else {
                    System.out.println(m2);
                }
                break;
            }
            i++;
        }
    }


    private static int fib(int n) {
        if (n==1||n==2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
