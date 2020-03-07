public class TestDemo5 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		for(i=1;i<=100;i++){
			if(i%10==9||i / 90 ==1|| i/1==9){
				count++;	
			}	
		}
		System.out.println(count);
	}
}
