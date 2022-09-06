package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<String>();
		
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add 값");
		System.out.println(numbers);
		
		numbers.add(1,"50");
		System.out.println("\n add(인덱스,값)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\n remove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\n get(인덱스)");
		System.out.println(numbers.get(2));
		
		System.out.println("\n size()");
		System.out.println(numbers.size());
		
		System.out.println("\n indexOf()");
		System.out.println(numbers.indexOf("45"));
		
		Iterator<String> it = numbers.iterator();			//Iterator 는 열거형 
		
		System.out.println("\n iterator");
		while(it.hasNext()) {
			String value = (String)it.next();
			if(value.equals("30")) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\n for each");
		for(String value : numbers) {			//배열과 컬렉션에서 향상된 for 문 사용가능
			System.out.println(value);
		}
		System.out.println("\n for");
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		
		
	}

}











