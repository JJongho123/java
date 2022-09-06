package ja_0725;

public class Wrapper_11 {
	public static void main(String[] args) {
		
	Double one = new Double("10");
	double two = 3;
	double result = one.doubleValue()/two;
	
	System.out.println("result      :"+result);
	System.out.println("NAN 체크     :"+Double.isNaN(result));
	System.out.println("무한대 체크    :"+Double.isInfinite(result));
	System.out.println("Double 최대값 :"+Double.MAX_VALUE);
	System.out.println("Double 최소값 :"+Double.MIN_VALUE);
	
		
	
		
		
		
		
		
	}

}
