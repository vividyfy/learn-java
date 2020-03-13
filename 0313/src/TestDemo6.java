import java.util.Scanner;
public class TestDemo6 {
    public static int jump(int n) {
        int count = 1;
        if(n==1||n==2) {
            return n;
        }
        return jump(n-1)+jump(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = scan.nextInt();
        System.out.println(jump(floor));
    }
}
