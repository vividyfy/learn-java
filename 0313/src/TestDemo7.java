import java.util.Scanner;
public class TestDemo7 {
    public static int jump(int n) {
        if(n==1||n==2) {
            return n;
        }
        int i = 1; int j = 2;int sum = 0;//5
        for (int m = 3;m<=n;m++) {
            sum = i+j;//3 5
            i = j;//2 3
            j = sum;//3 5
    }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor = scan.nextInt();
        System.out.println(jump(floor));
    }
}
