
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            String s2 = scanner.next();
            StringBuffer s3 = new StringBuffer();
            char[] c = new char[1024];
        for (int i = 0; i < s2.length(); i++) {
            c[s2.charAt(i)] = 1;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (c[s1.charAt(i)] != 1) {
                s3.append(s1.charAt(i));
            }
        }
        System.out.println(s3.toString());

        }
    }
