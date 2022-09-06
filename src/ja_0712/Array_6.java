package ja_0712;

public class Array_6 {
    public static void main(String[] args) {
    	
    	int[][] score = {
    			{100,100,100,100},
    			{90,90,90,90},
    			{80,80,80,80},
    			{70,70,70,70},
    			{60,60,60,60}};
    	
    	int korTotal = 0;
    	int engTotal = 0;
    	int mathTotal = 0;
    	int scinTotal = 0;
    	
    	
    	
    	System.out.println("번호\t국어\t영어\t수학\t과학\t총점\t평균");
    	System.out.println("=========================================================");
    	
    	for (int i =0; i < score.length; i++) {
    		int sum = 0;
    		
    		korTotal += score[i][0];
    		engTotal += score[i][1];
    		mathTotal += score[i][2];
    		scinTotal += score [i][3];
    		
    		System.out.print("   " + (i+1) + "   "); //번호
    		
    		for (int j = 0; j < score[i].length; j++) {
    		sum += score[i][j];
    		System.out.print(score[i][j] + "\t");
    	}
    		System.out.println(sum + "\t" + (float)sum / score[i].length); //총점,평균
    				
    }
    	
   
    System.out.println("=========================================================");
    System.out.println("총점 : "  + korTotal + "\t" + engTotal + "\t" + mathTotal +  "\t" + scinTotal);
    } 	
    	
	
}

