package ja_0719;

abstract class Style_88 {
	int i = 77;

	abstract void draw();

	abstract void print();
	
	abstract void message();


}

class Square extends Style_88 {

	@Override
	void draw() {
		System.out.println(" 사각형을 그린다!! ");

	}

	@Override
	void print() {
		System.out.println(" Square ");

	}

	@Override
	void message() {
		System.out.println(" !!!! 사각형 message !!!!");
		
	}

}

class Triangel extends Style_88 {
	@Override
	void draw() {
		System.out.println(" @@ 삼각형을 그린다!! ");

	}

	@Override
	void print() {
		System.out.println(" Triangel @!@!@ ");

	}

	@Override
	void message() {
		System.out.println(" 삼각형 message @!@!@!");
		
	}

}

class Circle extends Style_88 {

	@Override
	void draw() {
		System.out.println(" 원 을 그린다!! ");

	}

	@Override
	void print() {
		System.out.println(" Circle ");

	}

	@Override
	void message() {
		System.out.println(" 원 message ###########");
		
	}

}

public class Style_2 {
	public static void main(String[] args) {

		Square obj1 = new Square();
		Triangel obj2 = new Triangel();
		Circle obj3 = new Circle();

		obj1.draw();
		obj1.print();
		obj1.message();

		obj2.draw();
		obj2.print();
		obj2.message();

		obj3.draw();
		obj3.print();
		obj3.message();

		System.out.println("==========================");

		Style_88 obj4 = new Square();

		obj4.draw();
		obj4.print();
		obj4.message();
		
		obj4 = new Triangel();
		obj4.draw();
		obj4.print();
		obj4.message();

		
		obj4 = new Circle();
		obj4.draw();
		obj4.print();
		obj4.message();


	}

}









