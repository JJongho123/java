package ja_0728;

import java.util.Set;
import java.util.TreeSet;

public class Ex_0728_1 {
	public static void main(String[] args) {
		
		 StringBuffer stbf = new StringBuffer("Java");
		 
		 stbf.append(" Program");
		 
		 System.out.println(stbf);
		 
		 for(int i =0; i<stbf.length();i++) {
			 System.out.print(stbf.charAt(i));
			 
		 }
		 System.out.println();
		 for(int i=stbf.length()-1;i>=0;i--) {
			 System.out.print(stbf.charAt(i));
			 
		 }
		 stbf.insert(4, "*");
		 
		 System.out.println(stbf);
		 
		 System.out.println("문자열길이 :"+stbf.length());
		 
		 stbf.setLength(5);
		 
		 System.out.println("새로운 문자열 길이 "+stbf.length());
		 
		 System.out.println("setLength(5) : "+ stbf);
		 
		 System.out.println("반전 문자열 : "+stbf.reverse());
		
	}
	
	
		


	
		
		
	}

