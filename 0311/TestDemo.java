import java.util.Scanner;
public class TestDemo {
	public static void num(int a) {
		if(a>9) {
			num(a/10);
		}
		System.out.println(a%10) ;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		num(a);
	}
}