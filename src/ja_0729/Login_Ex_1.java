package ja_0729;

import java.util.HashMap;
import java.util.Scanner;

public class Login_Ex_1 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap ();
		
		
			
		map.put("jjh33534","skan");
		map.put("jjh33534",1234);
		
		Scanner ss = new Scanner(System.in);
		
		while(true) {
			System.out.println("id 와 password 를 입력해 주세요!! ");
			System.out.print("id : ");
			Object id = ss.next().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 "+id+"는 존재하지 않습니다. 다시입력해 주세요.");
				continue;
			}
			else {
//				if(map.get(id))	//String 타입으로 받거나 int 타입으로 받기
//				System.out.print("password : ");
				Object password = ss.next().trim();	
//				System.out.println();

					if(!(map.get(id)==password)) {
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해 주세요!!");
				}else {
					System.out.println("로그인 되었습니다 !");
					break;
				}
			}
		}
		
	}
}

		
		
		
		
	


