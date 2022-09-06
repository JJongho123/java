package ja_0727;

import java.util.ArrayList;
import java.util.List;

public class Ex_0727_1 {
	public static void main(String[] args) {
		
		final int LIMIT = 10;
		
		String source = new String("0123456789abcdefghijklmnABCDEFG@#$%^&*()ZZZ123456");
		
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT+10);
		
		System.out.println(" list.size() : "+list.size());
		for(int i=0;i<length;i+=LIMIT) {
			if(i+LIMIT<length) {
				list.add(source.substring(i, i+LIMIT));
			}
			else 
				list.add(source.substring(i));
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}












