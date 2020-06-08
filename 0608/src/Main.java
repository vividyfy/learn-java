import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int count = 0;
        if (h <= 2 && w % 2 == 1) {
            count = w / 2 * h + h;
        } else if (h <= 2 && w % 2 == 0) {
            count = (w * h) / 2;
        } else if (h >= 3 && w % 2 == 0) {
            count = (w * h) / 2;
        } else if ( h >= 3 && w % 2 == 1) {
            count = (w * h) / 2 + 1;
        }
        System.out.println(count);
    }
}
