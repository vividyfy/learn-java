//100-200间的素数
public class TestDemo2 {
	public static void main(String[] args) {
		int i;
		for (i=100;i<=200;i++) {
			int a;
			for (a=2;a<=Math.sqrt(i);a++) {
				if(i%a==0){
					break;
				}
			}
			if(a>Math.sqrt(i)){
				System.out.println(i);
			}
		}
	}
}