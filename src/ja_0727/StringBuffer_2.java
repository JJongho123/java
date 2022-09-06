package ja_0727;

public class StringBuffer_2 {
	public static void main(String[] args) {

		StringBuffer stbf = new StringBuffer("Java");	//StringBuffer 는 객체를 생성해야지 사용가능

		stbf.append(" Program");	//append()  = 문자열 추가 메서드

		System.out.println(stbf);

		for (int i = 0; i < stbf.length(); i++) {
			System.out.print(stbf.charAt(i) + "\t");
		}

		System.out.println();
		for (int i = stbf.length() - 1; i >= 0; i--) {
			System.out.print(stbf.charAt(i) + "\t");
		}

		stbf.insert(4, "*");	//insert()  문자를 추가하는 메서드   = >  index 4 에 * 을 집어넣어는 코드
		
		System.out.println("\n" + stbf);

		System.out.println(" 문자열의 길이 : " + stbf.length());

		stbf.setLength(5);		// setLength()  길이를 변경하는 메서드  => 길이를 5로 바꾼다

		System.out.println("새로운 문자열의 길이 : " + stbf.length());

		System.out.println("setLength(5) 적용 문자열 :" + stbf);

		System.out.println("반전 문자열 : " + stbf.reverse());  // reverse()    =>  문자열을 반전시키는메서드

	}

}
