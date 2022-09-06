package ja_0715;

class This11{
	
	
	private String name;
	int age;
	char sex;
	
	public This11(String name,int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public This11() {
		this("밝은미소",27,'f');
		System.out.println("=================");
		
	}
	public This11(String name , int age) {
		//this(name,age,'m');
		this.name = name;
		this.age = age;
		this.sex = 'm';
		
		
	}
	public This11(String name,char sex) {
		this(name,19,sex);
	}
	public void display() {
		System.out.println("이름:"+name+"나이:"+age+"성별:"+sex);
	}
	
}




public class Ex0715_1 {
	public static void main(String[] args) {
		This11 t1 = new This11();
		This11 t2 = new This11("민우",25);
		This11 t3 = new This11("유진",'f');
		
		t1.display();
		t2.display();
		t3.display();
		
}
}
	
	
	
	
	
	
	
	
	
	
