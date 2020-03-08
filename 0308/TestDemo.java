public class TestDemo {
	public static void main(String[] args) {
		int i;
		int count = 0;
		for (i=1; i<=100; i++) {
			if(i%10==9) {
				count++;
			}
			if(i/10==9) {
				count++;
			}
		}
		System.out.println(count);
	}
}