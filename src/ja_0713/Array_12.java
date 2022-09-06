package ja_0713;

public class Array_12 {
	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("usage : java Array_12 num1 OP num2");
			System.exit(0);

		}
		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);
	
		
		

		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;

		default:
			System.out.println("사칙 연산만 가능~~~");
			System.out.println("다른 연산자는 지원되지 않습니다.~~~");
			break;

		}
		System.out.println("결과 : "+result);
	}
}
