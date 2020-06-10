import java.util.Scanner;

public class solution5 {
    static int weight[];
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            weight = new int[n+1];
            for (int i = 1; i < n + 1; i++) {
                weight[i] = scanner.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }

    }

    private static void count(int s, int n) {
        if (s==0) {
            count++;
            return;
        }
        if (s<0 || s>0&&n<0) {
            return;
        }
        count(s-weight[n],n-1);
        count(s,n-1);
    }
}
