package ja_0721;

public class UserPackage_11 {
	
	String name;
	int age;
	
	public UserPackage_11(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public void message(String str) {
		System.out.println(" 이름은 :"+name+" 나이는:"+age);
		System.out.println("전달된 내용 : "+ str);
		System.out.println("전달된 내용 : "+ str);
		
	}

}
