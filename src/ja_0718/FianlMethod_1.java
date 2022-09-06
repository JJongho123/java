package ja_0718;

class AA_4{
//	final void display()  final 붙은 메서드는 오버라이딩 불가하다.
	 void display() {
		System.out.println("재정의 불가 메서드 display() ~~~~~~~");
	}
}


class BB_4 extends AA_4
{
	
	void display() {
		System.out.println("재정의 한 메서드 display()@@@@@@@@");
	}
}




public class FianlMethod_1 {
	public static void main(String[] args) {

		BB_4 obj1 = new BB_4();
		
		obj1.display();
		
		
	}

}




















