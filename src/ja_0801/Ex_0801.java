package ja_0801;





	
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	import javax.script.ScriptException;

	/**
	 *  네이버 지식in 답변을 위해 작성한 콘솔 계산기 예제 코드입니다.
	 *  
	 *  관련 네이버 지식in 게시글
	 *   - http://kin.naver.com/qna/detail.nhn?d1id=1&dirId=1040201&docId=255878649
	 *  @author nnoco
	 **/
	public class ConsoleCaculator {
		// 초기화된 상태(첫 번째 숫자를 읽을 차례)
		public static final int STATE_INITIAL = 0;
		
		// 숫자를 읽을 상태(두 번째 숫자)
		public static final int STATE_READ_NUMBER = 1;
		
		// 숫자를 정상적으로 읽지 못한 경우
		public static final int STATE_READ_NUMBER_ERROR = 2;
		
		// 연산자를 읽을 상태
		public static final int STATE_READ_OPERATOR = 3;
		
		// 잘못된 연산자를 입력한 경우
		public static final int STATE_READ_OPERATOR_ERROR = 4;
		
		// 두 번째 숫자를 입력한 후 결과를 출력하기 위한 상태
		public static final int STATE_PRINT_RESULT = 5;
		
		// 초기화를 하기 위한 상태(초기화 명령을 입력한 경우)
		public static final int STATE_CLEAR = 6;
		
		// 프로그램을 종료하기 위한 상태
		public static final int STATE_QUIT = 7;
		
		// 계산 가능한 연산자 집합 - 올바른 연산자가 입력되었는지 확인하기 위해 사용
		public Set<String> validOperators;
		private Scanner scanner = new Scanner(System.in);
		
		public ConsoleCaculator() {
			scanner = new Scanner(System.in);
			
			// 연산자 집합(Set)에 +, -, *, / 를 추가 
			validOperators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
		}
		
		public void start() {
			boolean isContinue = true;
			
			double operand1 = 0, operand2 = 0, result;
			String operator = null;
			int state = STATE_INITIAL;
			UserInput input = null;
			
			// isContinue 값이 true인 경우 계속해서 while 루프를 돌게 되며
			// 프로그램을 종료할 때(Q 입력 시) false로 바뀌고 루프를 종료함으로써
			// 프로그램을 종료
			while(isContinue) {
				switch(state) {
				// 첫 번째 숫자(operand1)을 입력하는 상태
				case STATE_INITIAL:
					input = readNumber(state);
					// 읽어온 숫자를 operand1에 저장(첫 번째 숫자)
					operand1 = input.number;
					state = input.nextState;
					break;
					
				// 숫자를 읽는 상태에서의 처리
				case STATE_READ_NUMBER:
					input = readNumber(state);
					// 읽어온 숫자를 operand2에 저장(두 번째 숫자)
					operand2 = input.number;
					state = input.nextState;
					break;
					
				// 결과를 출력하는 상태의 처리
				case STATE_PRINT_RESULT:
					result = calculateResult(operand1, operand2, operator);
					System.out.printf("결과: %s %s %s = %s\n", operand1, operator, operand2, result);
					operand1 = result;
					state = STATE_READ_OPERATOR;
					operator = null;
					break;
				
				// 잘못된 숫자를 입력한 경우
				case STATE_READ_NUMBER_ERROR:
					System.out.println("잘못된 숫자입니다. 올바른 숫자를 입력해 주십시오.");
					// 연산자 입력여부로 첫 번째 숫자인지, 두 번째 숫자인지를 구분함
					// 연산자가 null인 경우 첫 번째 숫자를 입력 중 오류가 났던 것을 알 수 있다. 
					state = operator == null ? STATE_INITIAL : STATE_READ_NUMBER; 
					break;
					
				// 연산자를 읽을 상태에서의 처리
				case STATE_READ_OPERATOR:
					input = readOperator();
					// operator 변수에 읽은 연산자를 저장
					operator = input.operator;
					state = input.nextState;
					break;
					
				// 잘못된 연산자를 입력한 경우의 처리
				case STATE_READ_OPERATOR_ERROR:
					System.out.println("잘못된 연산자입니다.");
					// 다시 연산자를 읽는 상태로 돌아감
					state = STATE_READ_OPERATOR;
					break;
					
				// 초기화를 하는 경우의 처리
				case STATE_CLEAR:
					// 초기 상태로 돌아감
					state = STATE_INITIAL;
					// 입력받은 연산자를 null로 초기화
					operator = null;
					System.out.println("초기화 되었습니다.");
					break;
					
				// 프로그램을 종료할 때의 처리
				case STATE_QUIT:
					System.out.println("프로그램을 종료합니다.");
					// while 루프의 조건인 isContinue를 false로 하여
					// 루프를 종료하도록 함
					isContinue = false;
					break;
				}
			}
		}
		
		private UserInput readNumber(int state) {
			return readInput("숫자를 입력해 주세요(초기화는 C, 종료는 Q): ", state);
		}
		
		private UserInput readOperator() {
			return readInput("연산자를 입력해주세요(+, -, *, /, 초기화는 C, 종료는 Q): ", STATE_READ_OPERATOR);
		}
		
		private UserInput readInput(String message, int state) {
			System.out.print(message);
			String input = scanner.nextLine();
			
			if("C".equals(input)) { // 초기화 여부 확인
				return UserInput.CLEAR;
			} else if ("Q".equals(input)) { // 종료 여부 확인
				return UserInput.QUIT;
			} else { // 종료나 초기화가 아닌 경우
				if(state == STATE_READ_NUMBER) {
					return checkNumber(input, STATE_PRINT_RESULT);
				} else if (state == STATE_INITIAL) {
					return checkNumber(input, STATE_READ_OPERATOR);
				} else {
					return checkOperator(input);
				}
				
			}
		}
		
		private UserInput checkNumber(String input, int state) {
			try {
				double number = Double.parseDouble(input);
				return new UserInput(state, number);
			} catch(NumberFormatException e) {
				return UserInput.READ_NUMBER_ERROR;
			}
		}
		
		private UserInput checkOperator(String input) {
			if(validOperators.contains(input)) {
				return new UserInput(STATE_READ_NUMBER, input);
			} else {
				return UserInput.READ_OPERATOR_ERROR;
			}
		}
		
		private double calculateResult(double operand1, double operand2, String operator) {
			switch(operator) {
			case "+": return operand1 + operand2;
			case "-": return operand1 - operand2;
			case "*": return operand1 * operand2;
			case "/": return operand1 / operand2;
			}
			return 0;
		}
		
		public static void main(String[] args) throws ScriptException {
			new ConsoleCaculator().start();
		}
	}

	// 사용자가 입력한 정보를 저장하기 위한 클래스
	class UserInput {
		public static final UserInput QUIT = new UserInput(ConsoleCaculator.STATE_QUIT);
		public static final UserInput CLEAR = new UserInput(ConsoleCaculator.STATE_CLEAR);
		public static final UserInput READ_NUMBER_ERROR = new UserInput(ConsoleCaculator.STATE_READ_NUMBER_ERROR);
		public static final UserInput READ_OPERATOR_ERROR = new UserInput(ConsoleCaculator.STATE_READ_OPERATOR_ERROR);
		
		// 다음 상태를 저장함
		public final int nextState;
		
		// 입력받은 숫자를 저장할 멤버 변수
		public final double number;
		
		// 입력받은 연산자를 저장할 멤버 변수
		public final String operator;
		
		public UserInput(int nextState, double number, String operator) {
			this.nextState = nextState;
			this.number = number;
			this.operator = operator;
		}
		
		public UserInput(int nextState) {
			this(nextState, 0, null);
		}
		
		public UserInput(int nextState, double number) {
			this(nextState, number, null);
		}
		
		public UserInput(int nextState, String operator) {
			this(nextState, 0, operator);
		}
	}