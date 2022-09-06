package ja_0729;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_1 {
	public static void main(String[] args) {
//		Character kbs = ' ';
		List<Character> list = new ArrayList<>();
		
		for(int i=0;i<26;i++) {
		char kbs = (char) (65+i);
			
			list.add(kbs);
		}
		System.out.println("섞기전  "+list);
		
		Collections.shuffle(list);
		
		System.out.println("섞은 후후후 "+list);
		
		
	}

}
