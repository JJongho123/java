package ja_0727;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
	public static void main(String[] args) {
		
		final int LIMIT = 10;
		
		String source =  new String("0123456789abcdefghijklmnABCDEFG@#$%^&*()ZZZ123456");
		
		int length = source.length();
		System.out.println(length);
		System.out.println(length / LIMIT);
		
		List<String> list = new ArrayList<String>(length / LIMIT+10); 	//크기를 약간 여유있게
																	//몫을 나눈후에 나머지를 담기위한 +10이다
		System.out.println("list.size() : "+list.size());
		for(int i=0; i<length; i += LIMIT) {
			if(i+LIMIT<length) {
				list.add(source.substring(i,i + LIMIT));
				
			}
			else
				list.add(source.substring(i));	//나머지값을 다담는다.
			}
//		System.out.println(list.capacity());
		System.out.println("list.size() : "+list.size());
		
		for(int i=0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}

}
