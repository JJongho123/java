package ja_0720;

class JenogException extends Exception {

	public JenogException(String str) {
		super(str);
	}
}


public class UserExceptionTest {
	public static void main(String[] args) {

		int abc = 33;
		String aa = "가나다";

		try {
			if (abc % 5 != 0) {
				throw new JenogException("나의 전용 예외~~~~~~");

			}
		} catch (JenogException e) {

			System.out.println(" 나도 예외로 동작합니다. @@@");
			System.err.println(" 나도 예외로 동작합니다. @@@");
			e.printStackTrace();
		}
	

	}

}
