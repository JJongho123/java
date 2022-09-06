package ja_0719;

abstract class 도형 {
	int i = 33;

	abstract void draw(); // 아래서 상속받을때 꼭 오버라이딩 해줘야한다.

	void show() {
		System.out.println(" 도형 클래스 속 show() 메서드 ~~~~ ");
	}
}

class 사각형 extends 도형 {

	@Override
	void draw() {
		System.out.println(" 사각형을 그린다 .");
	}
}

class 삼각형 extends 도형 {

	@Override
	void draw() {		
		System.out.println(" 삼각형을 그린다. ");
	}
}

public class Style_1 {
	public static void main(String[] args) {

		도형 obj1 = new 사각형();		// 다형성 활용 
		도형 obj2 = new 삼각형();

		obj1.draw();
		obj1.show();
		obj2.draw();
		obj2.show();

	}
}
