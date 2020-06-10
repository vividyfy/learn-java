import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!s2.contains(String.valueOf(ch[i]))) {
                System.out.print(ch[i]);
            }
        }
    }
}
