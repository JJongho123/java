package ja_0712;

import java.util.Iterator;

public class Array_1 {public static void main(String[] args) {
	int[] month = new int[12]; //배열 객체 생성
	
	
	month[0] = 31;
	month[1] = 28;
	month[2] = 31;
	month[3] = 30;
	month[4] = 31;
	month[5] = 30;
	month[6] = 31;
	month[7] = 31;
	month[8] = 30;
	month[9] = 31;
	month[10] = 30;
	month[11] = 31;
	//month[12] = 31; 
	
	 for (int i = 0; i <12; i++) {
		 System.out.println((i + 1) + " 일 = " + month[i] + "일");
	 }
}

}
