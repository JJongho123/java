package ja_0715;

class AA_3
{
	int a = 10;
	int b = 20;
	
	void display() {
		System.out.println("AA_3 a = "+a+" ,b = "+b);
	}
}

class BB_3 extends AA_3{
	int a = 333;
	int b = 555;
	
	void display() {
		System.out.println("BB_3 display a = "+a+", b = "+b);
	}
	void show() {
		super.display();
		this.display();
		
		int total = this.a + this.b + super.a + super.b;
		
		System.out.println(" total ="+total);
		
		System.out.println("BB_3 show show a =" +a+" , b = "+b);
	}
	
}




public class SuperTest_3 {
	public static void main(String[] args) {
		
		BB_3 obj1 = new BB_3();
		
		obj1.display();
		obj1.show();
		
		System.out.println("============================================");

		BB_3 obj2 = null;
		
		AA_3 obj3 = new BB_3();
		
		obj3.display();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println("============================================");
		
		obj2=(BB_3)obj3;
		
		obj2.display();
		obj2.show();
	}
}
		

		








