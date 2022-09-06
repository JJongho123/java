package ja_0726;

public class String_12 {
	public static void main(String[] args) {
		
		String str_1 = "java";
		String str_2 = "JAva";
		String str_3 = "java";
		
		System.out.println("문자열 1 :"+str_1);
		System.out.println("문자열 2 :"+str_2);
		System.out.println("문자열 3 :"+str_3);
		
		System.out.println("JAVA == java : "+((str_1==str_2)?"동일일" : "틀림"));
		System.out.println("JAVA  equals  java : "+((str_1.equals(str_2))? "동일일":"틀림"));
		System.out.println("JAVA  equalsIgnoreCase  java : "+((str_1.equalsIgnoreCase(str_2))? "동일일":"틀림"));
		
		System.err.println("str_1 : "+System.identityHashCode(str_1));
		System.err.println("str_2 : "+System.identityHashCode(str_2));
		System.err.println("str_3 : "+System.identityHashCode(str_3));
		System.out.println();
		System.err.println("str_1 : "+str_1.hashCode());
		System.err.println("str_2 : "+str_2.hashCode());
		System.err.println("str_3 : "+str_3.hashCode());
		
		//equalsIgnoreCase() 메서드는 대소문자 상관없이 비교하는 메서드
		
		
		
	}

}
