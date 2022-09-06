package ja_0726;

public class String_5 {
	public static void main(String[] args) {
		
		String[] joomin = {"800323_1523645","821034_2523645",
						"840216_2524445","861203_1523645",
						"870917_4553645","980325_3453544",
						"555555555555","88888888888"};
		
//		charAt 메서드 = 문자열인덱스를 추출하는 메서드  char  메서드 이니까 char 타입으로 비교한다.
//		Ex] joomin[i].charAt(7)   = joomin[i] 에서 인데스 7의 값을 뽑아낸다. => 주민번호 뒷자리 추출
	
		for (int i = 0; i < joomin.length; i++) {
			System.out.println("  "+joomin[i]);
			
			System.out.println(" 주민번호 뒷자리중 첫째숫자는 :"+joomin[i].charAt(7));
			if(joomin[i].charAt(7)=='1'||joomin[i].charAt(7)=='3') {
				System.out.println(" 성별이    남자입니다.");
			}
			else if(joomin[i].charAt(7)=='2'||joomin[i].charAt(7)=='4')
			{
				System.out.println(" 성별이 여자입니다.");
			}
			else
			{
				System.out.println(" 사람이 아닙니다.");
			}
			System.out.println("===============================");
		}
	}
}




















