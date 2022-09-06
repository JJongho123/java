package ja_0713;

public class Array_13 {
	public static void main(String[] args) {
		
		final int SIZE = 6;
		
		int[] freq = new int[SIZE];
//		freq = {0,1,2,3,4,5}
		
		for(int i=0;i<6;i++) {
			
			++freq[(int)(Math.random()*SIZE)]; //0  ~  5
			
//			System.out.println(freq[i]);
		}
		
		System.out.println("=============================");
		System.out.println("    면		빈도수");
		System.out.println("=============================");
		
		for (int i=0;i<SIZE;i++) {
			System.out.println("    "+(i)+"     :     "+freq[i]+"");
			
		}
		
	}

}
