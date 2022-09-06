package ja_0725;

public class String_2 {
	public static void main(String[] args) {
		
		int ii = 77;
		float ff = 45.78f;
		
		String str = "점수 :";
		
		System.out.println(str+ii+','+ff);			//String 과 다른타입의 연산은 String 으로 바뀜
		System.out.println(2 + 0 + 2 + 2+ " 년"+2+0+2+2 );	
		System.out.println("월드컵 : "+ 2 + 0 + 2 + 2);	//String + int 이기때문에 String 연산으로 바뀜.
		//String 연산 뒤에는 계속 String 연산으로 진행된다.
		
		
		
		
		

	}
}
