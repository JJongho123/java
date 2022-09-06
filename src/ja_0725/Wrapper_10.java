package ja_0725;

public class Wrapper_10 {
	public static void main(String[] args) {
		
		Float one = new Float("237.345f");
		
		
		System.out.println("현재 값 :"+one);
		System.out.println("byte  값 :"+one.byteValue());
		System.out.println("short  값 :"+one.shortValue());
		System.out.println("int  값 :"+one.intValue());
		System.out.println("long  값 :"+one.longValue());
		System.out.println("float  값 :"+one.floatValue());
		System.out.println("double  값 :"+one.doubleValue());	//실수라서 오차발생
		System.out.println("Nan  체크:"+one.isNaN());				//숫자가 아닌지 판별하는 메서드
		System.out.println("무한대 체크 :"+one.isInfinite());
		
		
		
	}

}
