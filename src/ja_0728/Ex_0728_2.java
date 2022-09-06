package ja_0728;

import java.util.HashSet;
import java.util.Iterator;

public class Ex_0728_2 {
	public static void main(String[] args) {
	
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		
		HashSet<String> setHap = new HashSet<String>();
		HashSet<String> setKyo = new HashSet<String>();
		HashSet<String> setCha = new HashSet<String>(); 
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		
		System.out.println(" A = "+setA);
		
		setB.add("3");
		setB.add("4");
		setB.add("5");
		setB.add("6");
		
		System.out.println(" B = "+setB);
		
		Iterator itt = setB.iterator();
		
		while(itt.hasNext()) {
			
			String obj = (String) itt.next();
			
			if(setA.contains(obj)) {
				setKyo.add(obj);
			}
				
		}
		itt = setA.iterator();
		
		while(itt.hasNext()) {
			String obj = (String)itt.next();
			
			if(!setB.contains(obj)) {
				setCha.add(obj);
			}
		}
		itt = setA.iterator();
		
		while(itt.hasNext()) {
			setHap.add((String) itt.next());
		}
		itt = setB.iterator();
		while(itt.hasNext()) {
			setHap.add((String) itt.next());
		}
		System.out.println("A n B : "+setKyo);
		System.out.println("A u B : "+setHap);
		System.out.println("A - B : "+setCha);
		
		System.out.println();
		
		System.out.println("A n B : "+setA.retainAll(setB));	//두객체의 공통적인 요소는 HashSet에 남기고
		System.out.println("A n B : : "+setA);					//그외의 요소들은 HashSet 에서 삭제합니다.
		System.out.println("A u B : "+setA.addAll(setB));
		
		System.out.println("A - B : "+setA.removeAll(setB));
		System.out.println("A - B : "+setB);
		
		
		
	}
}














