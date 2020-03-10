import java.util.Scanner;
public class TestDemo2 {
//1-100的和	
	public static int addSum(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++ ) {
			sum += i;
		}
		return sum;
	}
//100以内奇数和和偶数和
	public static int addSum2(int n) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1;i<=n;i++) {
			if(i%2==0){
				sum1 += i;
			}else{
				sum2 += i;
			}
		}
		System.out.println(sum1);//2550
		System.out.println(sum2);//2500
		return 0;
	}
//求1!+2!+3!+4!+5!
	public static int facSum(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			int ret = 1;
			for (int j=1;j<=i;j++) {
				ret *= j;
			}
			sum += ret;
		}
		System.out.println(sum);//153
		return 0;
	}
//求1!+2!+3!+4!+5!的优化，调用fac(n)
	public static int facSum2(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum += fac(i);
		}
		System.out.println(sum);//153
		return sum;
	}
//求数字n的阶乘
	public static int fac(int n) {
		int ret = 1;
		for (int j=1;j<=n;j++) {
			ret *= j;
		}
		return ret;
	}
	public static void main(String[] args) {
		int ret = addSum(100);
		addSum2(100);
		facSum(5);
		facSum2(5);
		System.out.println(ret);//5050
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ret2 = fac(a);//6
		System.out.println(ret2);//720
	}
}
