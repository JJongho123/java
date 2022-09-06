package ja_0728;

import java.util.Calendar;
import java.util.Date;

public class Calendar_3 {
	public static void main(String[] args) {
		
		Calendar cal =  Calendar.getInstance();
		
		Date date = cal.getTime();
		
		System.out.println("오늘은 : "+date);
		System.out.println("오늘은 올해의 : "+cal.get(Calendar.DAY_OF_YEAR)+"날입니다.");
		System.out.println("오늘은 이번주의 : "+cal.get(Calendar.DAY_OF_WEEK)+" 일입니다. ");
		System.out.println("오늘은 올해의 : "+cal.get(Calendar.WEEK_OF_YEAR)+"주입니다.");
		System.out.println("오늘은 달의 : "+cal.get(Calendar.DAY_OF_MONTH)+"일입니다.");
		
		
		
		
		
		
		
	}

}
