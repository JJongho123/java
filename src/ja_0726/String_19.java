package ja_0726;

public class String_19 {
	public static void main(String[] args) {
		String[] joomin = {"900323_1523645","982101_11252364",
							"940216_2524445","961203_1523645",
							"990917_2553645","980323_2345322"};
							
		for(int i = 0;i<joomin.length;i++) {
			
				int index = joomin[i].indexOf('_');

				String ext = joomin[i].substring((index+1),(index+2));
				System.out.println();
		
//				if(joomin[i].substring(7,8).equals("1")) {
				if(ext.equals("1")) {
					System.out.println("성별은 남자입니다.");
				}
				else
					System.out.println("성별은 여자입니다.");
				
				

				
				
		}
		
		
		
	}

}
