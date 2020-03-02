public class TestDemo {
	//增量运算
	public static void main(String[] args) {
		double m1 = 10, m2 = 10, m3 = 10, m4 = 10, m5 = 10;
		m1 += 1;
		m2 -= 1;
		m3 *= 1;
		m4 /= 1;
		m5 %= 1;
		System.out.println(m1);//11
		System.out.println(m2);//9
		System.out.println(m3);//10
		System.out.println(m4);//10
		System.out.println(m5);//0
	}
	//int 转 String
	public static void main7(String[] args) {
		int num = 10;
		String s5 = num + "";//方法一
		String s6 = String.valueOf(num);//方法二
		System.out.println(s5);//10
		System.out.println(s6);//10
	//String转int
	    String s7 = "10";
	    int num2 = Integer.parseInt(s7);	 
		System.out.println(num2);//10
	}
	//string
	public static void main6(String[] args) {
		String s1 = "\"hello\"";
		String s2 = "\"world\"";
		String s3 = s1 + s2;
		System.out.println(s3);//"hello""world"
		String s4 = "result = ";
		int a = 10;
		int b = 20;
		String c = s4 + (double)a/b;
		System.out.println(c);//result = 0.5 
	}
	//char
	public static void main5(String[] args) {
		char ch = '你';
		System.out.println(ch);//你
	}
	//float
	public static void main4(String[] args) {
		float e = 0.1f;
		float f = 0.2f;
		System.out.println(e*f);//0.020000001
	}
	//double
	public static void main3(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a/b);//0
		double c = 1;
		double d = 2;
		System.out.println(c/d);//0.5
	}
	//long表示范围
  	public static void main2(String[] args) {
		System.out.println(Long.MAX_VALUE);
		//最大：9223372036854775807
		System.out.println(Long.MIN_VALUE);	
		//最小：-9223372036854775808
  	}
	//int表示范围
	public static void main1(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		//最大：2147483647
		System.out.println(Integer.MIN_VALUE);
		//最小：-2147483648
	}
}