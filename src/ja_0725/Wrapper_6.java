package ja_0725;

public class Wrapper_6 {
	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("345");
		Object bool_3 = new Boolean("TruE");
		
		if(bool_1.booleanValue()) {
			System.out.println(" bool_1 객체는 true 입니다.");
		}
		else {
			System.out.println(" bool_1 객체는 false 입니다.");
		}
		
		if(bool_2.booleanValue()) {
			System.out.println(" bool_2 객체는 true 입니다.");
		}
		else {
			System.out.println(" bool_2 객체는 false 입니다.");
		}
		if(((Boolean) bool_3).booleanValue()) {
			System.out.println(" bool_3 객체는 true 입니다.");
		}
		else {
			System.out.println(" bool_3 객체는 false 입니다.");
		}
		
	}
	

}
