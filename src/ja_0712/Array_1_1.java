package ja_0712;

public class Array_1_1 {
 public static void main(String[] args) {
	 
	 int [] ball = new int[45];
	 
	 for(int i=0;i<ball.length; i++) {
		 
		 ball[i]=i+1;
		 
		 
	 }
	 int temp = 0 ;
	 int j = 0;
	 
	 for(int i=0; i<300; i++) {
		 
		 j=(int)(Math.random()*45);
		 
		 temp = ball[0];
		 ball[0]= ball[j];
		 ball[j] = temp;
		 
	 }
	 System.out.println();
	 System.out.println("\n 1200회차 로또 번호 \n");
	 
	 for(int i =0;i<6;i++) {
		 System.out.print(ball[i]+"\t");
	 }
	 System.out.println();
	 System.out.println();
	 System.out.println();

 
 }	
	
	
	

}
