package ja_0726;

public class String_13 {
	
	static String str_1 = "kbs";
	static String str_2 = "kbs";
	
	public static void main(String[] args) {
		
		for(int i = 0;i<10;i++) {
			
			str_1 += i;
			str_2 += i;
		}
		System.out.println("str_1 : "+str_1);
		System.out.println("str_2 : "+str_2);
		System.err.println("str_11 : "+str_1.hashCode());
		System.err.println("str_22 : "+str_2.hashCode());
		System.err.println("str_1111 : "+System.identityHashCode(str_1));
		System.err.println("str_2222 : "+System.identityHashCode(str_2));
		
		System.out.println("str_1 == str_2  : "+((str_1==str_2)?"동일일":"틀림"));
		System.out.println("str_1 equals str_2 :"+((str_1.equals(str_2))?"동일일":"틀림"));
		System.out.println("str_1 equalsIgnoreCase  str_2 : "+((str_1.equalsIgnoreCase(str_2))?"동동일":"틀림"));
		
		
		
	}

}
