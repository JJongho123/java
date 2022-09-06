package ja_0725;

public class String_1 {
	public static void main(String[] args) {
		
		char[] ss = {'K','o','r','e','a'};
		
		String str1 = "Hello";				//문자열 대입
		
		String str2 = new String("java");	//문자열 생성자
		String str3 = new String(ss);		//문자 배열을 이용한 생성자
		
		System.out.println(ss);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 + str2 + str3);
		
		System.out.println();
		System.out.println(ss.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str3.hashCode());
		String kbs1 = "Hello";					//String pool에 담겨있는 주소
		
		System.out.println(kbs1.hashCode());
		String kbs2 = new String("Hello");					
		System.out.println(kbs2.hashCode());
		
		if(str1.equals(kbs1)) {
			System.out.println("str1 과 kbs1 은 같다");
		}else {
			System.out.println("str1 과 kbs1 은 다르다");
		}
		if(str1.equals(kbs2)) {
			System.out.println("str1 과 kbs2 은 같다");
		}else {
			System.out.println("str1 과 kbs2 은 다르다");
		}
		//   equals 는 문자열 비교   == 은 주소비교
		
		if(str1==kbs1) {
			System.out.println("str1 과 kbs1 은 같다");
		}else {
			System.out.println("str1 과 kbs1 은 다르다");
		}
		if(str1==kbs2) {
			System.out.println("str1 과 kbs2 은 같다");
		}else {
			System.out.println("str1 과 kbs2 은 다르다");
			
		}
		System.out.println(kbs2.hashCode());
		System.out.println(str1.hashCode());
			
		//https://velog.io/@jeb1225/JAVA-String-pool
		
		
	}

}
















