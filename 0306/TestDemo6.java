//水仙花数
public class TestDemo6 {
	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 1000; i++){
			int a = (i/100);
			int b = (i - a*100)/10;
			int c = (i - a*100 - b*10 );
			if((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3) == i)&&(a != 0)){
				System.out.println(i);
			}
		}
	}
}
