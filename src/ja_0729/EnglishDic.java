package ja_0729;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		
		Map st = new HashMap();
		
		st.put("map","지도");
		st.put("java","자바");
		st.put("school","학교");
		st.put("korea","대한민국");
		st.put("seoul","대한민국 수도");
		st.put("English","영어" );
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("영어 단어를 입력하시요 >.(quit를 입력하면 프로그램이 종료됩니다.) ");
			String key = sc.next().trim();
			if(key.equals("quit")) 
				break;
			System.out.println("단어의 의미는 :"+st.get(key));
			
		}while(true);
		System.out.println("프로그램이 종료되었습니다.");
	}
	

}
