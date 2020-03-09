import java.util.Scanner;
public class TestDemo5 {
	public static int sum(int n) {
		int sum = 0;
		while (n != 0){
			
			sum += fac(n);
			n--;
		}
		return sum;
		
	}
	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ret = sum(n);
		System.out.println(ret);
	}
}