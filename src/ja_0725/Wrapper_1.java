package ja_0725;

public class Wrapper_1 {
	public static void main(String[] args) {

		Integer one = new Integer("345");
		Integer two = new Integer(45);

		int total = one.intValue() + two.intValue(); // intValue()는 숫자값
		String totalString = one.toString() + two.toString();

		System.out.println("one :" + one.intValue() + ", two :" + two.intValue());
		System.out.println("one :" + one + ", two :" + two);

		System.out.println("one + two :" + total);
		System.out.println("one.toString() + two.toString() :" + totalString);

		System.out.println(total + ">>2진수 :" + Integer.toBinaryString(total)); // 2진수표기
		System.out.println(total + ">>8진수 :" + Integer.toOctalString(total)); // 8진수표기
		System.out.println(total + ">>16진수 :" + Integer.toHexString(total)); // 16진수표기

		System.out.println(Integer.TYPE);

	}

}
