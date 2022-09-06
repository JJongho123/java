package ja_0712;

public class Array_2 {
     public static void main(String[] args) {
    	 
    	 
    	 
    	 int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    	 
    	 System.out.println(month.length);
    	 for (int i =0; i < month.length ; i++)//12보다 작아야하기때문에 "<" 써야함, 1년 12개월
    	 {
    		 
    		System.out.println((i +1)+ " 일 " + month[i] + " 일 ");
    	 }
    	 
}
}
