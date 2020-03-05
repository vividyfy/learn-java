public class TestDemo {
public static void main(String[] args) {
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
			sum1 += i;
			i++;
			} else {
			sum2 += i;
			i++;
			}	
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}	
	
}
