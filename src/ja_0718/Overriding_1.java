package ja_0718;

class AA_2 {
	int aa = 55;
	int bb = 77;

	void display() {
		System.out.println(" AA_2 클래스의 display() ~~ 메서드 ");
	}
}

class BB_2 extends AA_2 {
	int bb = 478;
	int cc = 888;

	void display() {
		System.out.println(" BB_2 클래스의 display() @@ 메서드 ");
	}
}

public class Overriding_1 {
	
	public static void main(String[] args) {
		
//		BB_2 obj1 = new BB_2();
//		AA_2 obj1 = new AA_2();
		
		AA_2 obj1 = new BB_2();	//멤버변수는 셰도잉 메서드는 오버라이딩
		
		
		//obj2.display();
		System.out.println("================================");
		
		
		obj1.display();
		System.out.println(obj1.bb);
		
		
		
		System.out.println("================================");
		
		
		//obj3.display();
	}

}





















