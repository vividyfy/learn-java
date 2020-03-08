import java.util.Scanner;
public class TestDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a%b;
		while(c != 0){
			a = b;
			b = c;
			c = a % b;
		}
		System.out.println("最大公约数："+b);
	}
}