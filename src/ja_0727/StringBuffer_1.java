package ja_0727;


public class StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer stbf_1 = new StringBuffer("Java");
		StringBuffer stbf_2 = new StringBuffer(10);
		StringBuffer stbf_3 = new StringBuffer();	//기본버퍼의 크기는 16
		
		
		System.out.println("stbf_1.length() :"+stbf_1.length());
		System.out.println("stbf_1.capacity() :"+stbf_1.capacity());
		
		System.out.println();
		System.out.println("stbf_2.length() :"+stbf_2.length());
		System.out.println("stbf_2.capacity() :"+stbf_2.capacity());
		//capacity() : 현재 문자열의 버퍼 크기
		
		System.out.println();
		System.out.println("stbf_3.length() :"+stbf_3.length());
		System.out.println("stbf_3.capacity() :"+stbf_3.capacity());
		
//		JVM 은 String 클래스에 문자열을 추가할때
//		내부적으로 StringBuffer 클래스로 변환해 처리합니다.
//		문자열 "가"와 "나"를 결합시키는 과정은 
//		
//			String ABC("가","나");
//				
//			StringBuffer ABC ("가나");
//				
//			String ABC("가나");  => 형식으로 바뀝니다.
		
		
		
		
	}

}
