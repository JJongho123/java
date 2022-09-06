package ja_0718;

class AA3{
	public AA3() {
		super();
		System.out.println(" AA3 생성자 호출 @@@@@@@@@@@@@");
	}
	int a = 33;
}
class BB3 extends AA3{
	public BB3() {
		System.out.println(" BB3 생성자 호출 ############");
	}
	int b =55;
}

class CC3 extends BB3{
	public CC3() {
		System.out.println(" CC3 생성자 호출$$$$$$$$$$$");
	}
	int c = 77;
}
public class Ex_0718_1 {
	public static void main(String[] args) {

//		CC3 obj1 = new CC3();
		BB3 obj1 = new BB3();
		
		
		System.out.println("\n obj1.a 의 값은 : "+obj1.a);
		System.out.println("\n obj1.b 의 값은 : "+obj1.b);
//		System.out.println("\n obj1.c 의 값은 : "+obj1.c);
		
	}
}

		
		
		
















