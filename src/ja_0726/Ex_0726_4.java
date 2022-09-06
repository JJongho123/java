package ja_0726;

public class Ex_0726_4 {
	public static void main(String[] args) {
		
		String[] joomin = {"800323_1523645","821034_2523645",
				"840216_2524445","861203_1523645",
				"870917_4553645","980325_3453544",
				"555555555555","88888888888"};
		
		for(int i=0;i<joomin.length;i++) {
			System.out.println(joomin[i]);
			
			System.out.println(joomin[i].charAt(7));
			
			System.out.println((joomin[i].charAt(7)=='1')?"남자입니다.":"여자입니다.");
//			((joomin[i].charAt(7)=='1')?"남자입니다.":"여자입니다.");
		}
		
	}

}
