package ja_0714;

class AA3
{
	int a = 10;
	int b = 20;
	
	void display () {
		System.out.println("AA3 = a"+a+" , b= "+b);
	}
}

class BB3 extends AA3{
	
	int a = 333;
	int b = 555;
	
	void display() {
		System.out.println("BB3 display a = "+a+" , b = "+b);
		
	}
	void show() {
		super.display();
		this.display();
		
		int total =this.a + this.b + super.a + super.b ;
		
		System.out.println(" total = "+total);
		
		System.out.println("BB3 show a = "+a+" , b = "+b);
	}
	
}
public class Ex_A_1{
	public static void main(String[]args) {
		
		BB3 obj1 = new BB3();
		
		AA3 obj2 = new BB3();

		obj1.display();
		obj1.show();
		obj1.display();
		obj2.display();
		//obj2.show();
		
		
	}
}












