package ja_0718;

class Con_11{
	
	int a = 33;
	
	void display() {
		System.out.println(" Con_11 메서드 display()~~~~~");
	}
	
}
class Con_22 extends Con_11{
	
	int b = 77;
	
}

class Con_33 extends Con_22{
	int a = 45;
	int c = 99;
	
	void display() {
		System.out.println(" Con_33 메서드 display() ######");
	}
	void show() {
		System.out.println(" Con_33 메서드 show()@@@@@@@@");
	}
}


public class Convert_1 {
	public static void main(String[] args) {

		Con_11 obj1 = new Con_33();		//확대 형변환
		Con_11 obj2 = new Con_22();
		
		
		Con_33 obj3 = (Con_33) obj1;	// 축소 형변환
		Con_22 obj4 = (Con_22) obj2;
		
		obj2.display();
		System.out.println("Con_22 a , b : "+obj4.a+" , "+obj4.b);
		
		obj1.display();
		System.out.println("Con_33 a , b : "+obj3.a+" , "+obj3.c);
		
	}

}










