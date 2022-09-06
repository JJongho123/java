package ja_0720;

public class Exception_3 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(34 / 0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(6);	//위에서 캐치블럭으로 예외를 잡아서 실행 x
		} finally {
			System.out.println(7);
			System.out.println(8);
		}

	}

}
