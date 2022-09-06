package ja_0715;

class AA_5 {
	int a = 33;

}

class BB_5 extends AA_5 {
	int b = 55;
}

class CC_5 extends BB_5 {	// 자바는 단일 상속만 허용함.
	int c = 77;
}

public class SuperTest_1 {
	public static void main(String[] args) {

		AA_5 obj1 = new AA_5();
		BB_5 obj2 = new BB_5();
		CC_5 obj3 = new CC_5();
		AA_5 obj4 = new CC_5();		//상속에서 객체를 형변환 한것이다  c 멤버는 쓸수없고 a멤버를 쓸수잇다.
		
		System.out.println(" \n obj1 : "+obj1.a);
		
		System.out.println(" \n obj2 상속받은 a : "+obj2.a);
		System.out.println(" \n obj2 : "+obj2.b);
		
		System.out.println(" \n obj3 상속받은 a : "+obj3.a);
		System.out.println(" \n obj3 상속받은 b : "+obj3.b);
		System.out.println(" \n obj3 : "+obj3.c);
		System.out.println(" \n obj4 : "+obj4.a);
		
		
		
	}

}
