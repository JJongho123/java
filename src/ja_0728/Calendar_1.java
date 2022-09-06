package ja_0728;

import java.util.Calendar;

public class Calendar_1 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();
		
		System.out.println("Calendart 클래스를 이용한 시간과 날짜 ");
		
		System.out.println(cal_1.get(Calendar.YEAR)+" 년");
		System.out.println((cal_1.get(Calendar.MONTH)+1)+" 월");		//month 는 인덱스 0 부터 시작
		System.out.println(cal_1.get(Calendar.DATE)+" 일");
		System.out.println(cal_1.get(Calendar.HOUR)+" 시");
		System.out.println(cal_1.get(Calendar.MINUTE)+" 분");
		System.out.println(cal_1.get(Calendar.SECOND)+" 초");
		
		
		
		
		
		
		
		
		
		
	}

}
