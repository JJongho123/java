package ja_0725;

public class String_3 {
	public static void main(String[] args) {
		
		char[] char_str = new char[15];
		
		String str = "오늘 날씨는 참 시원합니다.";
		
		for(int i =0;i<char_str.length;i++) {
			char_str[i] = (char)(65+i);
		}
		System.out.println();
		
		for(int i=0;i<char_str.length;i++) {
			System.out.print(char_str[i]);
		}
		
		
		System.out.println("\n str 문자 :"+str);
		System.out.println("str 문자 수 :"+str.length());
		
		str.getChars(7, 11, char_str, 0);
		System.out.println("char_str 문자수 :"+char_str.length);
		
		for(int i=0;i<char_str.length;i++) {
			System.out.print(char_str[i]);
		}
		
		
		
		
	}

}
