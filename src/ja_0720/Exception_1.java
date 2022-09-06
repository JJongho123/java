package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				System.out.println(" 첫번째 값을 입력하세요 ! ");
				int num1 = Integer.parseInt(input.readLine());

				System.out.println(" 두번째 값을 입력하세요 ! ");
				int num2 = Integer.parseInt(input.readLine());

				System.out.println(" " + num1 + " / " + num2 + " = " + (num1 / num2));
			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요 ! ");
				
				e.printStackTrace();  // 어디서 예외가 발생했는지 알게해주는 구문
				System.err.println(e.getMessage());
				
			} catch (ArithmeticException e) {
				System.err.println("몫이 0 이 될수없습니다 . ");
				System.err.println(e.getMessage());		// getMessage()는 에러가 어떤건지 보여줌
			}
			catch (Exception e) {  // Exception이 모든 에러를 잡아주기때문에  맨위로 올라가면 오류가뜸 
				System.err.println(" Exception 이 발생하였습니다. ");
			}
			finally{
				System.out.println(" \n 항상 실행되는 내용 \n");  
				// finally는 예외 발생과 상관없이 무조건 처리할 구문
			}
		}
	}
}















