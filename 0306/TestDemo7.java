//输密码
import java.util.Scanner;
public class TestDemo7 {
	public static void main(String[] args) {
		int password = 1044;
		for (int i = 1;i<=3;i++) {
			Scanner scan = new Scanner (System.in);
			int key = scan.nextInt();
			if(key == password) {
				System.out.println("登录成功！");
			}else if(key != password && (i ==1 || i == 2)){
				System.out.println("登录失败，请重新输入！");
			}else if(i==3 && key != password) {
					System.out.println("登录失败！");
			}
		}
	}
}