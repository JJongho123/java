package ja_0715;

class This2 {

    private String name;
	int age;
	char sex;

	public This2(String name , int age, char sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	public This2() {
		this("밝은미소",27,'m');  // 생성자 this()를 호출하기위해서는 반드시 첫번쨰줄에 있어야한다.
		System.out.println("=================================");   
	}
	public This2(String name , int age)
	{
		
		this(name , age ,'f');
	}
	public This2(String name , char sex) {
		this(name , 19 , sex);
		
	}
	public void display() {
		System.out.println(" 이름은 :"+name+" 나이는 : "+age + " 성별은 : "+ sex);
	}
}

public class ThisExe_2 {
	public static void main(String[] args) {
		
		This2 t1 = new This2();
		This2 t2 = new This2("민우",25);
		This2 t3 = new This2("유진",'f');
		
		
		t1.display();
		t2.display();
		t3.display();
		
		

	}
}










