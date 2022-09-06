package ja_0729;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex_0729_1 {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("정종호", new Integer(29));
		map.put("김지혜", new Integer(28));
		map.put("신동영", new Integer(25));
		
		Set set = map.entrySet();
		
		Iterator itt = set.iterator();
		
		while(itt.hasNext()) {
			Map.Entry e = (Entry)itt.next();
			
			System.out.println("이름 : "+e.getKey()+" , 나이 : "+e.getValue());
			
		}
		System.out.println();
		
		set = map.keySet();
		
		System.out.println("참가자 명단 : "+set);
		
		Collection value = map.values();
		
		itt = value.iterator();
		
		int total = 0;
		
		while(itt.hasNext()) {
			Integer ii = (Integer)itt.next();
			System.out.println("zz : "+ii);
			
			total += ii.intValue();
			
		}
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(value));
		System.out.println("최저점수 : "+Collections.min(value));
		
		
		
		
	}

}


















