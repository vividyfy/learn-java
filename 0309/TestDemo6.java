import java.util.Scanner;
public class TestDemo6 {
	public static int sum(int n, int m) {
		int sum = m + n;  
		return sum;
	}
	public static double sum(double i, double j, double k) {
		double sum = i + j + k;
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ret1 = sum(a,b);
		System.out.println(ret1);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double ret2 = sum(x,y,z);
		System.out.println(ret2);
	}
	
}