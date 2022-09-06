package ja_0725;

public class Wrapper_5 {
	public static void main(String[] args) {
		
		char obj[] = new char[args[1].length() +3];
		
		args[1].getChars(0, args[1].length(), obj, 2);
		
		for(int i =0;i<obj.length;i++) {
			System.out.println("입력된 문자 ["+ obj[i] + "]:");
			if(Character.isDefined(obj[i]))
				System.out.println("    유니코드 입니다.");
			if(Character.isDigit(obj[i]))
				System.out.println("숫자입니다.");
			if(Character.isLetter(obj[i]))
				System.out.println("문자입니다.");
			System.out.println("============================");
		}
		
		
	}

}
