import java.util.Scanner;

public class solution2 {
    public static boolean isRight(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1;
        String s2;
        int count = 0;
        Scanner scanner = new Scanner (System.in);
        s1 = scanner.next();
        s2 = scanner.next();
        for (int i = 0; i < s1.length(); i++) {
            String s3 = s1.substring(0,i)+ s2 + s1.substring(i);
            if (isRight(s3)) {
                count++;
            }
        }
        if (isRight(s1+s2)) count++;
        System.out.println(count);
    }
}
