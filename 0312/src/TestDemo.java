import java.util.Scanner;
public class TestDemo {
    public static int fib(int n) {
        if(n==1||n==2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int ret = fib(a);
        System.out.println(ret);
    }
}
