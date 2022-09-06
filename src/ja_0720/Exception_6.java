package ja_0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_6 {
	public static void main(String[] args) {
//  											JVM 으로 떠넘긴것이다.	
		try {
			input();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
//		input();
	}
		
	public static void input() throws ArithmeticException , IOException, NumberFormatException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print(" 첫번째 값을 입력하세요 => ");
			int num1 = Integer.parseInt(in.readLine());
		
			System.out.print(" 두번째 값을 입력하세요 => ");
			int num2 = Integer.parseInt(in.readLine());
			
			dividing(num1 , num2);
		}
		
	}
	public static void dividing(int num1 , int num2) throws ArithmeticException{
		System.out.println(num1 + " / "+num2+" = "+ num1/num2);
	}
	

}














