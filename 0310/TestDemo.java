import java.util.Scanner;
public class TestDemo {
	public static int max(int a,int b) {
		 int max = a>=b?a:b;
		return max;
	}
	public static double max1(double a,double b) {
		double max = a>=b?a:b;
		return max;
	}
	public static double max(double a,double b,int c) {
		double max = max1(a,b)>=c?max1(a,b):c;
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		System.out.println(max(a1,b1));

		double a2 = scan.nextDouble();
		double b2 = scan.nextDouble();
		System.out.println(max1(a2,b2));

		double a3 = scan.nextDouble();
		double b3 = scan.nextDouble();
		int c1 = scan.nextInt();
		System.out.println(max(a3,b3,c1));
	}
}