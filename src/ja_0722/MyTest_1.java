package ja_0722;

import ja_0721.MyPackage_22;
import ja_0721.MyPackage_33;
import ja_0721.UserPackage_11;

public class MyTest_1 {
	public static void main(String[] args) {
		
		UserPackage_11 obj1 = new UserPackage_11("korea",45);
		MyPackage_22 obj2 = new MyPackage_22();
		MyPackage_33 obj3 = new MyPackage_33();
		
		obj1.message("아름다운 사람");
		obj1.message("즐거운 하루~");
		
		obj2.show("화려한 금요일@@");
		
		obj2.show("싱그러운 바람!!");
		
		obj3.display("가나다라");
		
		String abc = obj2.getName();
		
		obj3.getName();
		
		
		obj2.getName();
		obj2.getName();
		
		System.out.println(obj2.getName());
		System.out.println(abc);
		System.out.println(obj3.getName());
		
		obj2.print("kbs",true);
	}

}













