public class TestDemo {
	public static void main(String[] args) {
		int m = 1;
		int n = 2;
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println(m);
		System.out.println(n);
	}
	public static void main2(String[] args) {
		int c = 1;
		int d = 2;
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println(c);
		System.out.println(d);
	}
	public static void main1(String[] args) {
		int a = 1;
		int b = 2;
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println(a);
		System.out.println(b);
	}
}