import java.util.Scanner;
public class TestDemo7 {
	public static int fib(int n) {
		if(n==1||n==2) {
			return n;
		}
		int i=1,j=2,sum=0;
		for(int m=3;m<=n;m++){
			sum = i+j;
			i=j;
			j=sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ret = fib(n);
		System.out.println(ret);
	}
	
}