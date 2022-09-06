package ja_0726;

public class Ex_0726_1 {
	public static void main(String[] args) {
		String[] joomin = {"900323_1523645","982101_11252364",
				"940216_2524445","961203_1523645",
				"990917_2553645","980323_2345322"};
		
		for(int i=0;i<joomin.length;i++) {
			
			int index = joomin[i].indexOf('_');
			System.out.println(index);
			
			System.out.println(joomin[i]);
			
			
			
			
			
			
			if(joomin[i].substring(7,8).equals("1")) {
				System.out.println("남자입니다.");
			}
			else {
				System.out.println("여자입니다.");
			}
			
		}
		
		
		
	}

}
