import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.nextLine();
            int count = 0, end = 0, max = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                    count++;
                    if (count > max) {
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(s1.substring(end - max + 1, end + 1));
        }
    }
}
