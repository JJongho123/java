package ja_0719;

interface AA_1{
	void print1();		//머리만있고 몸통이 없다.   public abstract void print1(); 랑 같은의미		
						//인터페이스 안에 메서드이므로 추상메서드 이다 abstract 생략됨.
	
}

class BB_1 implements AA_1{

	@Override
	public void print1() {
		System.out.println(" AA_1 인터페이스 메서드 재정의 !!!!!!!!");
		
	}
	public void print2() {
		System.out.println(" BB_1 클래스 메서드 print2() @@@@@");
	}
	
}

public class InterfaceTest_1 {
	public static void main(String[] args) {
		
		BB_1 obj1 = new BB_1();

		obj1.print1();
		obj1.print2();
		System.out.println("=====================================");
		AA_1 obj2 = new BB_1();
		
		obj2.print1();
		
	
		
	}
}










