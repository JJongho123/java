package ja_0720;

public class Exception_5 {
	public static void main(String[] args) {

		try {
			Exception obj = new Exception("고의로 만든 예외 발생");
			throw obj;
			// throw new Exception("고의로만든 예외발생");  
			
			
		} catch (Exception e) {
			System.out.println(" 내가만든 예외 ~~~");
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

	}

}
