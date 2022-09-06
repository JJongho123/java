package ja_0728;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Iterator_1 {
	public static void main(String[] args) {


		 Vector list = new Vector();		//Vector 에서도 Iterator 사용가능하다 List 를 구현했기떄문이다.
//		ArrayList list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add(8);
		list.add(9);
		list.add(new Date());
		list.add(45.899);

		System.out.println(list);
		System.out.println();

//		Iterator itt = list.iterator();
//
//		while (itt.hasNext()) {
//			Object obj = itt.next();			//	object 타입은 모든 타입을 받는 것.
//			System.out.println(obj);
//		}

		Enumeration enu = list.elements();
		
		while(enu.hasMoreElements()) {
			Object obj = enu.nextElement();		//	object 타입은 모든 타입을 받는 것.
			System.out.println(obj);
		
	}

}      
}













