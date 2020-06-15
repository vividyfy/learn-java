import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String ch = sc.next();
        int b = (a+1) / 2;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i==0||j==0||i==b-1||j==a-1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
