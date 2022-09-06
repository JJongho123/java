package ja_0727;

public class StringBuffer_3 {
	public static void main(String[] args) {
		
		long start, end;
		
		String str_1 = new String("1~70000 의 합 11 :");
		StringBuffer stbf_2 = new StringBuffer("1~70000 의 합 22 :");
		
		start = System.currentTimeMillis();
		
		for(int i=0;i<70000;i++) {
			str_1 += i;
			str_1 += "+";
		}
		end = System.currentTimeMillis();
		
		System.out.println("String Time : "+(end-start));
		
		start = System.currentTimeMillis();
		
		for(int i=0;i<70000;i++) {
			stbf_2.append(i);
			stbf_2.append("+");
		}
		end = System.currentTimeMillis();
		
		System.out.println("StringBuffer Time :"+(end-start));
		//String 이랑 StringBuffer 랑 문자열 더하기 차이가 많이남 StringBuffer 활용권장
	}

}
