//递归求1+2+3+4+...+9+10
public class TestDemo2 {
	public static int sum(int n) {
		if (n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(sum(n));
	}
}