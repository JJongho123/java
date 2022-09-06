package ja_0712;

public class Array_8 {
    public static void main(String[] args) {
	
    	int[] score = {83,64,35,97,58,73};
    	
    	int max = score[0];
    	int min = score[0];
    	
    	for (int i = 1; i < score.length ; i++) {
    		
    		if (score[i] > max)
    		   {
               max = score[i];
               }
    		
    		if (score[i] < min)
               {
	           min = score[i];
               }   
    	}
    	System.out.println("최대값 : " + max);
    	System.out.println("최소값 : " + min);
    	  	
}
}
