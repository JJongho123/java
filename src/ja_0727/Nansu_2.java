package ja_0727;

import java.util.Random;

public class Nansu_2 {
	public static void main(String[] args) {
		
		// seed 값을 주지않을 경우 일정한
		// 패턴으로 난수가 발생할수 있다.
		// 그래서 System.currentTimeMillis() 를 객체생성할때 넣어준다.
		
		//Random 클래스 객체를 이용해
		//270~530사이의 난수 100개를 만드시요 (상한값 - 하한값 +1)*난수발생) + 하한값 
		//	(int)(rnd.nextDouble()*(530-270+1))+270    난수발생 개념
//		(530-270+1)
		
		Random rnd = new Random(System.currentTimeMillis());
		int count = 0;
		
		
			
			
			
//			System.out.print((rnd.nextInt(530-270))+1+270+"\t");  
//	값은 같지만 난수발생공식 기본개념 자체가 실수값으로 되어잇으므로 아래방법으로 난수발생을 하는것을 권장한다.
			
			
			
		for(int i=0;i<300;i++) {
			
			int nan = (int)(rnd.nextDouble()*(530-270+1))+270;
			System.out.print(nan+"\t");
			
			count ++;
			
			if(count %7==0) {
				System.out.println();
			}
		}
		
		
		
	}

}









