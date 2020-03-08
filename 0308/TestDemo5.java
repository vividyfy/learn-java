public class TestDemo5 {
	public static long fac(int n) {
		if(n==1) {
			return 1;
		}
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		long ret = fac(5);
		System.out.println(ret);
	}
}