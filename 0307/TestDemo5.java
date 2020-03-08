import java.util.Random;
import java.util.Scanner;
public class TestDemo5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
		int b = random.nextInt(101);
		while(true) {
			System.out.println("请输入要猜的数字：");
			int a = scan.nextInt();
			if(a>b) {
				System.out.println("大了");
			}else if (a<b) {
				System.out.println("小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
	}
}