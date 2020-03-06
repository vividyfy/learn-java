import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		if(num <= 18) {
			System.out.println("少年");
		}else if (num <= 28) {
			System.out.println("青年");
		}else if (num <= 55) {
			System.out.println("中年");
		}else {
			System.out.println("老年");
		}
	}
}