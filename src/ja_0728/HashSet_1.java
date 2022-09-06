package ja_0728;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 {
	public static void main(String[] args) {
		
		Object[] obj = {"1", new Integer(1),"1","4","4","2","2","3","3","4","4"};
		//set 은 중복을 허용하지 않고 순서도 상관 X    하지만  위에서 문자열 1 과 숫자 1 은 다르기때문에 중복되서 나온거처럼보인다.
		
		Set sett = new LinkedHashSet();
		
		for(int i= 0;i<obj.length;i++) {
			sett.add(obj[i]);
		}
		System.out.println(sett);
		
		
		
	}

}
