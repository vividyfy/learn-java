public class TestDemo3 {
	public static void main(String[] args) {
		for(int num=2;num<=100;num++) {
			int a = 0;
			for(int b=2;b<num;b++) {
				if(num%b == 0) {
				a++;
				}
			}
			if (a==0){
				System.out.println(num);
			}				
		}
	}
	
}