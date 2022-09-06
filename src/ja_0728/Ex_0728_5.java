package ja_0728;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex_0728_5 {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		Set set2 = new HashSet();
		
		while(true) {
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));
			
			if(set.size()==6) {
				break;
			}
		}
		List list = new LinkedList(set);
		
		System.out.println(list);
		Collections.sort(list);
		
	}
	
	
	
}





