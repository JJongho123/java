package ja_0729;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		map.put(1234,"abcd");
		map.put(1111,"qwer");
		map.put(4567,"korea");
		map.put(7890,"dddd");
		map.put(7890,"cccc");	//key(왼쪽값)는 중복 X  나중것만 적용된다.   value(오른쪽값)는 중복 허용 
		Scanner ss = new Scanner(System.in);
		
		while(true) {
			System.out.println("id 와 password 를 입력해 주세요!! ");
			System.out.print("id : ");
			int id =  ss.nextInt();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 "+id+"는 존재하지 않습니다. 다시입력해 주세요.");
				continue;
			}
			else {
				System.out.print("password : ");
				String password = ss.next().trim();	//문자열을 받기위해 next 만 사용 trim은 좌우공백 지우기위함
				System.out.println();
//				if(!(map.get(id).equals(password))) {	//	equals 비교도 가능하지만 숫자는 ==비교를 습관화하자
					if(!(map.get(id).equals(password))) {
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











