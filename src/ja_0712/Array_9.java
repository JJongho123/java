package ja_0712;

public class Array_9 {
       public static void main(String[] args) {
	
    	   int[] number = new int[10];
    	   
    	   for(int i = 0; i < number.length; i++) {
    		   number[i] = i;
    		   
    		   System.out.print(number[i] + "\t");   		    		 
    		   
    	   }
    	   
    	   System.out.println();
    	   
    	  for(int i = 0; i < 100; i++) {
    		  int n= (int) (Math.random() * 10); //0~9사이의 임의의 숫자가 나온다
    		  
    		  int temp = number[0]; //첫번째 방과 number방을 100번 교환
    		  number[0] = number[n];
    		  number[n] = temp;		  
    		  
    	  }
    	  for(int i = 0; i < number.length; i++) {
    		  System.out.print(number[i] + "\t");
    	  }
}
}
