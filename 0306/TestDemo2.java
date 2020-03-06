import java.util.Scanner;
public class TestDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int a = 0;
		if(num == 0 || num ==1) {
			System.out.println("既不是素数也不是合数");
		}
		if (num >= 2) {
			for (int i=2;i<num;i++) {
				if(num%i==0) {
				a++;
				}
			}
			if(a==0) {
				System.out.println(num + "是素数");
			}else {
				System.out.println(num + "是合数");
			}
		}
	}
}