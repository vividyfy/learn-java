public class TestDemo2 {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 3;
		int max = 0;
		int min = 0;
		if (a > b && a > c){
			max = a;
		}
		else if (b > a && b > c){
			max = b;
		}
		else 
			max = c;
		if (a < b && a < c) {
			min = a;	
		}
		else if (b < a && b < c) {
			min = b;	
		}
		else
			min = c;
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}