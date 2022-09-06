package ja_0728;

import java.util.Calendar;

public class Calendar_2 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();
		Calendar cal_2 = Calendar.getInstance();
		
		cal_1.set(2022, 07,30);
		cal_2.set(2022, 07,31);
		
		if(cal_1.after(cal_2)) {
			System.out.println("현재시간은 2022 , 7 , 31 후 입니다.");
		}else if(cal_1.before(cal_2))
		{
			System.out.println("현재시간은 2022 , 7 ,31 전 입니다.");
		}else
		{
			System.out.println("현재시간은 2022 , 7 ,31 입니다");
		}
		
		
		
		
		
		
		
	}

}
