package ja_0726;

public class String_8 {
	public static void main(String[] args) {
		
		String str = "몇 개의 단어가 포함되어 있나요!";
		
		int count = 0;
		
		for(int i = 0 ;i<str.length();i++) {
			if(str.charAt(i)==32) {			//아스키코드 32 는 스페이스바이기 때문에 공백의 갯수를 세었다.
				count++;
			}
		}
		System.out.println("단어의 갯수 :"+ (count+1)+" 개 ");
	}

}
