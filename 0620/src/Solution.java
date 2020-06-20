import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = (n * 2 + 1) % 1000000007;
            count++;
        }
        int res = (count + 2) / 3;
        System.out.println(res > 1000000006 ? -1 : res);
    }
}
