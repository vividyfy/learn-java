//输入一个非负整数，返回组成它的数字之和. 
//例如，输入 1729, 则应该返回1+7+2+9， 它的和是19
import java.util.Scanner;
public class TestDemo3 {
	public static int sum(int n) {
		if (n<=9) {
			return n;
		}
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(sum(a));
	}
}