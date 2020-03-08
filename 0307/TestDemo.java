//判断素数
//方法一：
import java.util.Scanner;
import java.lang.Math;
public class TestDemo {
	public static void main1(String[] args) {
		Scanner scan = new Scanner (System.in);
		int i = scan.nextInt();
		int n = 2;
		for (n=2 ; n<i ; n++) {
			if(i%n==0) {
				break;
			}
		}
		if(n==i) {
			System.out.println(i+"是素数");
		}else if (i==1||i==0) {
			System.out.println(i+"不是素数也不是合数");
		}
		else {
			System.out.println(i+"不是素数");			
		}

	}
	/*方法二
	如果n不是素数，则它可以写成a*b = n的形式，
	乘数a b中必定有一个数小于等于n/2。
	 */
	public static void main2(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = 2;
		for (b=2 ; b<=a/2 ; b++) {
			if(a%b==0) {
				break;
			}
		}
		if(b>a/2) {
			System.out.println(a+"是素数");
		}else if (a==1||a==0) {
			System.out.println(a+"不是素数也不是合数");
		}else{
			System.out.println(a+"不是素数");			
		}
	}
	/*方法三：
	若n不是素数，一定有一个乘数是小于根号n的。
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int c = scan.nextInt();
		int d = 2;
		for (d=2 ; d<=Math.sqrt(c) ; d++) {
			if(c%d==0) {
				break;
			}
		}
		if (c==1||c==0) {
			System.out.println(c+"不是素数也不是合数");
		}else if(d>Math.sqrt(c)) {
			System.out.println(c+"是素数");
		}else{
			System.out.println(c+"不是素数");			
		}
	}
}