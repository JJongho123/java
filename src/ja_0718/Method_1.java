package ja_0718;

class Super_1
{
	public void display() {
		System.out.println("Super_1 class display() Method~~~~~~");
		show();
	}
	
	
	
	
	protected void message() {
		System.out.println("Super_1 class message() Method@@@@@@@");
	}
	void print() {
		System.out.println("Super_1 class print() Method#######");
		
	}
	private void show() {
		System.err.println("Super_1 class show() Method^^^^^^^^^^^^^^");
	}
}
		





public class Method_1 extends Super_1{
	public static void main(String[] args) {
		Method_1 obj1 = new Method_1();
	
		obj1.display();
		obj1.message();
		obj1.print();
//		obj1.show();		접근하려면 같은 클래스 내에서 실행한다.
	

}
}

















