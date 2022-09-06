package ja_0727;

import java.util.Vector;

public class Vector_1 {
	public static void main(String[] args) {

		Vector<String> vv = new Vector<String>(5);
		
		
		
		//제너릭을 안써도 되지만 쓰기를 권장한다.
		//컬렉션 프레임웍 관련 사이트
		// https://keepmind.net/java-collection-framework-1/
		
		print(vv);

		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");	//5개를 만들었지만 6까지 허용된다  자동적으로 늘려준다.

		print(vv);

		vv.trimToSize(); // 빈공간을 없앤다

		System.out.println("====================66");

		print(vv);

		vv.ensureCapacity(7); // Vector 의 용량이 최소한 minCapacity 가 되도록 한다.
		System.out.println("====================77");
		print(vv);
		System.out.println("====================88");

		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");
		vv.add("7");
		vv.add("8");
		print(vv);

		vv.setSize(8);
		System.out.println("=======================");
		print(vv);

		vv.clear();
		System.out.println("=======================");
		print(vv);
		
	}

	private static void print(Vector<String> vv) {
		System.out.println(vv);
		System.out.println("vv.size : " + vv.size());
		System.out.println("vv.capacity : " + vv.capacity());

	}

}






