package ja_0714;

class Method_1 {
	double x;
	double y;

	public Method_1(double x, double y) { // 생성자 x , y 는 지역변수

		this.x = x;
		this.y = y;
		return; 	//생략가능

	}

	public double add() { // 멤버 메서드
		return (this.x + this.y);
	}

	public double add2() { // 멤버 메서드
		return (this.x - this.y);
	}

	public double mul() { // 멤버 메서드
		return (this.x * this.y);
	}

	public double div() { // 멤버 메서드
		return (this.x / this.y);
	}

}

public class Method_Test {
	public static void main(String[] args) {

		Method_1 obj = new Method_1(600, 50);

		double abc = obj.add();
		double add2_1 = obj.add2();
		double mul_1 = obj.mul();
		double div_1 = obj.div();

		System.out.println("더하기 :" + obj.add());
		System.out.println("빼기 :" + obj.add2());
		System.out.println("곱하기 :" + obj.mul());
		System.out.println("나누기 :" + obj.div());
		System.out.println(abc);
		System.out.println(add2_1);
		System.out.println(mul_1);
		System.out.println(div_1);
	}
}
