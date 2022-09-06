package ja_0818;

import java.util.Vector;

public class Ex0820 {
	public static void main(String[] args) {
	
	Vector vv = new Vector(5);
	
	print(vv);
	
	vv.add("1");
	vv.add("2");
	vv.add("3");
	vv.add("4");
	vv.add("5");
	vv.add("6");
	
	print(vv);
	
	vv.trimToSize();
	
	System.out.println("==============================66");
	
	print(vv);
	vv.ensureCapacity(7);
	System.out.println("==============================77");
	print(vv);
	System.out.println("==============================88");
	
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
	System.out.println("====================");
	print(vv);
	
	vv.clear();
	System.out.println("=====================");
	print(vv);
	
	
	
	}
	private static void print(Vector vv) {
		System.out.println(vv);
		System.out.println("vv.size : "+vv.size());
		System.out.println("vv.capacity : "+vv.capacity());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	














