import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = fac(n);
        System.out.println(count(m));
    }

    private static int count(long m) {
        int count = 0;
        while (m % 10 == 0) {
            count++;
            m = m/10;
        }
        return count;
    }

//    private static long fac(int n) {
//        int count = 1;
//        for (int i = 0; i < n; i++) {
//            count *= i;
//        }
//        return count;
//    }
    private static long fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

}
