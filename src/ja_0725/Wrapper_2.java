package ja_0725;

public class Wrapper_2 {
	public static void main(String[] args) {
		
		Integer abc1 = new Integer(789);
		Integer abc2 = new Integer(456);
		
		int kbs1 = (int)abc1;			//UnBoxing
		int kbs2 = abc2;				//Auto UnBoxing
		
		Integer bbc1 = (Integer)357;	//Boxing
		Integer bbc2 = 589;				//Auto Boxing
		
		Integer king1 = abc1+abc2;		//Wrapper 끼리연산
		Integer king2 = kbs1+kbs2;		//기본형 끼리 연산후 Auto Boxing
		
		int queen1 = abc1 + kbs1;		//기본형과 Wrapper 형 연산
		
		System.out.println("abc1 :"+abc1);
		System.out.println("abc2 :"+abc2);
		System.out.println("kbs1 :"+kbs1);
		System.out.println("kbs2 :"+kbs2);
		System.out.println("    bbc1 :"+bbc1);
		System.out.println("    bbc2 :"+bbc2);
		System.out.println("king1 :"+king1);
		System.out.println("king2 :"+king2);
		System.out.println("queen1 :"+queen1);
		
		
//		언제 오토박싱과 언박싱을 사용해야 할까요?
//		래퍼런스 타입과 기본타입 사이의 "임피던스불일치" 가 있는
//		경우에만 사용하세요(기본타입을 쓸수 없는 경우에만 쓰세요)
//		예를 들어 Map 이나 Set 같은 Java Collection에는
//		기본타입을 못넣으니까
//		이런경우에는 래퍼런스 타입을 쓰면 됩니다.
//		하지만 과학 계산이나 , 성능에 민감한 계산코드에
//		오토박싱 / 언박싱을 사용하는건 적절하지 않습니다.
//		Integer 는 int 를 완벽히 대체할수 없습니다.
//		오토박싱과 언박싱은 기본타입과 레퍼런스 타입사이의 구분을
//		흐릿하게 만들어주지만 그차이를 완벽히 없애는것은 아닙니다.
		
		
		
	}

}
















