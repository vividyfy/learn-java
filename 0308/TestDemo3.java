public class TestDemo3 {
	public static void main(String[] args) {
		int i;
		for (i=0;i<=99999999;i++) {
			//确定位数
			int count = 0;
			int tmp = i;
			while(tmp != 0) {
				count++;
				tmp = tmp/10;  
			}
			//求数字i的每一位
			int sum = 0;
			tmp = i;
			while(tmp != 0){
				sum += Math.pow(tmp%10,count);
				tmp = tmp/10;
			}
			if(sum==i){
				System.out.println(sum);
			}
		}
	}
}