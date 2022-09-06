package ja_0721;

public class MyPackage_22 {

	String name;
	
	
	//art + shift + s
	public String getName() {
		return name;
	}


	

	public void show(String str) {
		
		name = str;
		System.out.println("show() 메서드호출");
		System.out.println("show() 메서드호출");
	}




	public void print(String name, boolean sex) {
		
		System.out.println("나의 이름은 :"+name);
		if(sex) {
			System.out.println("남자 입니다.");
		}else {
			System.out.println("여자 입니다.");
		}
		
	}
}
	










