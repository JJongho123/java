package ja_0715;

class Overloading {
	public Overloading() {	//생략가능

	}

	void display() {
		System.out.println(" 전달된 값 없음!! ");
	}

	void display(int a) {
		System.out.println("a 값은 : " + a);
	}

	void display(String name) {
		System.out.println(" 전달된 이름은 : " + name);
	}

	void display(String name, int age) {
		System.out.println("이름은 :" + name + "나이는 : " + age);
	}

	void display(String name, int age, char abc) {
		System.out.println("이름은 :" + name + "나이는 : " + age + " 성별은 : " + abc);
	}

}

public class OverloadingExe {
	public static void main(String[] args) {
		
		Overloading obj = new Overloading();
		
		obj.display();
		obj.display(45);
		obj.display("수선화");
		obj.display("국화꽃");
		obj.display("백일홍",25);
		obj.display("해바라기",25,'f');

	}

}















