import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            if (m==3) {
                count = 1;
            }
            if (m==0) {
                break;
            }
            if (m < 3) {
                count = 0;
            }
            if (m > 3) {
                count = m / 2;
            }
            System.out.println(count);
        }
    }
    public static int count = 0;

}
