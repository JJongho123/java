package ja_0718;

class AA_3 {
	public AA_3() {
		super();
		System.out.println(" AA_3 생성자 호출######");

	}

	int a = 33;

}

class BB_3 extends AA_3 {
	public BB_3() {
		System.out.println(" BB_3 생성자 호출@@@@@");

	}

	int b = 55;

}

class CC_3 extends BB_3 {
	public CC_3() {
		System.out.println(" CC_3 생성자 호출~~~~~");
	}

	int c = 77;
}

public class superTest_1 {
	public static void main(String[] args) {

		CC_3 obj1 = new CC_3();
//		BB_3 obj1 = new CC_3();

		System.out.println("\n obj1.a 의 값은 :" + obj1.a);
		System.out.println("\n obj1.b 의 값은 :" + obj1.b);
		System.out.println("\n obj1.c 의 값은 :" + obj1.c);

	}

}












