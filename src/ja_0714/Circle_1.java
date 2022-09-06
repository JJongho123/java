package ja_0714;

public class Circle_1 {

	public static void main(String[] args) {

		final float PI = 3.1415f; // final 으로 선언한 변수는 상수 선언되고 값변경이 불가하다
								  //그리고 이건 관례 변수를 대문자로 써준다.

		int r = 13;

		double area = PI * r * r;
		double area2 = PI * 2 * r;

		System.out.printf(" 원의 넓이 = %7.3f \u33A0", area);
		System.out.println();
		System.out.printf(" 원의 둘레 = %7.3f \u339D", area2);

	}
}
