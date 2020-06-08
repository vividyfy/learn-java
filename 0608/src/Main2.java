import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = Math.max(a,b);
        int j = Math.min(a,b);
        int c = func(i,j);
        System.out.println((i*j)/c);

    }
    public static int func(int a, int b) {
        while (b != 0) {
            if (a == b) {
                return a;
            }
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
