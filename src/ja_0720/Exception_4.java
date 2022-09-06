package ja_0720;

import java.io.FileNotFoundException;

public class Exception_4 {
	public static void main(String[] args) {
		
		try {
			System.err.println("============예외발생전===========");
			throw new FileNotFoundException("IO => 입출력 예외발생~~");
			
		}
		catch (NumberFormatException e) {
			System.out.println(" 내가 만든 예외 2222222!!!!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(" 내가만든 예외33333333 @@@@@@");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println(" 내가만든 예외 44444444444#####");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		}
		
	}

}
