import java.util.Scanner;
public class TestDemo6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int count = 0;
		while(m != 0){
			count++;
			m = m & (m-1);
			}
		System.out.println(count);
	}
		}

	//public static void main1(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		//int count1 = 0;
		//while(n != 0){
		//	if((n & 1) != 0) {
		//		count1++;
		//	}
		//	n = n>>>1;
		//}
		//System.out.println(count1);
	//}
