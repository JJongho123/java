package ja_0715;

class Info {

	private String name;
	private int age;
	private char sex;
	private String tel;
	
	public Info() {
		
	}

	public Info(String n, int a, char s, String t) {	//생성자 

		name = n;
		age = a;
		sex = s;
		tel = t;
	}

	protected void display() {		// 정보출력 메서드

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("번호 : " + tel);
		
		System.out.println();

	}
}

public class InfoExe {
	public static void main(String[] args) {
		
		Info obj1 = new Info("홍길동",27,'m',"010-1234-5678");	// obj1 초기화
		Info obj2 = new Info("수선화",36,'f',"010-8888-9999");	// obj2 초기화
		Info obj3 = new Info();
		
		obj1.display();		// display 메서드 호출
		obj2.display();
		obj3.display();    	// default  
		
	}

}
