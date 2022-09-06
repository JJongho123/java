package ja_0727;

import java.util.StringTokenizer;

public class StringTokenuzerTest {
	public static void main(String[] args) {
		
		String str = "자바는 다양한, 문자열 처리, 날짜처리, "+
					"시간처리, 를 위한 메서드를, 갖고 있습니다.";
	
	StringTokenizer stt = new StringTokenizer(str,",");			//토큰화로 문자열을 분리할수있다.
	
	System.out.println("토큰 ',' 의 수 :"+stt.countTokens());
	
	while(stt.hasMoreTokens()) {	
		System.out.println(stt.nextToken());
	}
	}
}
