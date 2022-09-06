package ja_0729;

import java.util.TreeSet;

public class TreeSet_2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "e";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("dzzzz");
		set.add("elephant");
		set.add("korea");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		
		System.out.println("range search : from : "+from+" to "+to);
		System.out.println("result11 : "+set.subSet(from,to));
		System.out.println("result22 : "+set.subSet(from,to));
		//아스키코드에 의해서 자동 정렬됨 . 대문자가 작다 => 아스키코드가 소문자보다 작으니까
		
	}
}





