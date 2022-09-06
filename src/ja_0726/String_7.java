package ja_0726;

public class String_7 {
	public static void main(String[] args) {
		
		String[] juju = {"940625_1623444","990625_4623444",
						"960625_2623444","980625_1623444",
						"940625_3623444","970625_2623444"};
		
		//indexOf 메서드  =  indexOf("a",b)   =>   a의 값을 b부터 찾겟다는 의미.
		//Ex] juju[i].indexOf("2",7)==7     => juju[i]에서 2를 인덱스 7번째부터 찾겟다. int값으로 비교함
		
		for(int i = 0 ;i<juju.length;i++) {
			if(juju[i].indexOf("2",7)==7||juju[i].indexOf("4",7)==7) {
				System.out.println(juju[i]+"는 여자입니다.");
			}
			else 
				System.out.println(juju[i]+"는 남자입니다.");
		
		
		
		
		
	}
}
}
