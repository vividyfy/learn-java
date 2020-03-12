import java.util.Scanner;
public class TestDemo4 {
	public static int max3(int a, int b,int c) {
   		int max = max2(max2(a,b),c);
   		return max;
	}
	public static int max2(int m, int n) {
		int max = m >= n ? m : n;
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int ret = max3(a,b,c);
		System.out.println(ret);
	}
}