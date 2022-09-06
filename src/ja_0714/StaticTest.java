package ja_0714;

class Static_1 {
	static int num = 0; // static 안에 클래스 변수(cv)
	int xx = 0; // class 안에잇는건 멤버변수
	int yy = 0;
}

public class StaticTest {
	public static void main(String[] args) {

		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		Static_1 ss3 = new Static_1();

		Static_1.num = 88;                 //Static  클래스 이름으로 접근해준다.
		ss1.xx = 43;
		ss1.yy = 57;
		
		
		System.out.println(" \n ss1.num ="+ss1.num +"\n ss1.xx ="+ss1.xx+"\n ss1.yy ="+ss1.yy);

		
		Static_1.num = 999;
		ss2.xx = 233;
		ss2.yy = 345;
		
		System.out.println(" \n ss2.num ="+ss2.num +"\n ss2.xx ="+ss2.xx+"\n ss2.yy ="+ss2.yy);
		
		System.out.println(" \n ss3.num ="+ss3.num +"\n ss3.xx ="+ss3.xx+"\n ss3.yy ="+ss3.yy);
		
		
		System.out.println(" \n Static_1.num ="+Static_1.num +"\n ss3.xx ="+ss3.xx+"\n ss3.yy ="+ss3.yy);
	}
}
