package ja_0722;

class King extends Object {
	String kbs;

	public King() {
	}

	public King(String kbs) {
		this.kbs = kbs;
	}

//	public String toString() {
//		return "비가오는 금요일~~~~";
//	}
}

public class Object_1 {
	public static void main(String[] args) {

		King obj = new King();
		King obj1 = obj;
		
		King obj2 = new King();
		
		
		
		System.out.println("클래스 이름 : "+obj.getClass());
		System.out.println("해쉬 코드  : "+obj.hashCode());
		System.out.println("해쉬 코드11  : "+obj1.hashCode());
		System.out.println("해쉬 코드22 : "+obj2.hashCode());
		
		
		System.out.println("객체 문자열 : "+obj.toString());
		System.out.println("객체 문자열 : "+obj);
		
		
		
		
		
	}
}










