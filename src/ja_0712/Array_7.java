package ja_0712;

public class Array_7 {
    public static void main(String[] args) {
	
    	
    	int[] mbc = new int[100];
    	int kk = 0;
    	
    	for(int i = 0; i < mbc.length; i++) {
    		mbc[i] = i;
    	kk ++;
    	System.out.print(mbc[i] + "\t");
    	if (kk % 7 == 0)
    	{
    		System.out.print("\n");
    		
    	}   		
    	
}
    System.out.println("mbc 배열의 크기 : " + mbc.length);
}
    
}
