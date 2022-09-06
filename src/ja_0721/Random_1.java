package ja_0721;

public class Random_1 {
	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		// 15 ~ 57 사이의 난수 10개 발생
		
		for(int i=0;i<100;i++) {
			
			number = (int)(Math.random()*(57-15+1)+15);		//난수발생 공식 (상한가-하한가+1)+(하한가)
			
			count++;
			
			System.out.printf("%5d",number);
			
			if(count % 10 ==0) {
				System.out.println();
			}
		}
	}
}

