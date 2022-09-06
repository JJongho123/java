package ja_0715;

class Info2 {

	private String name;
	private int age;
	private char sex;
	private String tel;
	
	// 생성자 오버로딩
	// 두메서드가 같은 이름을 갖고 있으나 인자의 수나 자료형이 다른경우를 말한다.
	
	public Info2(String n, int a, char s , String t) {
		System.out.println(n);
		age = a;
		sex = s;
		tel = t;
	}

	public Info2(String n, int a) {
		name = n;
		age = a;
		sex = 'm';
		tel = "010-1234-5678";
	}

	public Info2(String n, char s ,String t) {

		name = n;
		age = 77;
		sex = s;
		tel = t;
	}
	public Info2(int a , char s) {
		
		name = "장미";
		age = a;
		sex = s;
		
	}
	public Info2(String n) {
		name = n;
		age = 25;
		sex = 'f';
		tel = "010-2585-8456";
	}

	public Info2() {  //디폴트 생성자는 직접 값을 받는다.
		name = "해바라기";
		age = 36;
		sex = 'm';
		
	}

	public void display(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+sex);
		System.out.println("번호 : "+tel);
	}

	
}

public class InfoExe_2 {
	public static void main(String[] args) {
		
		Info2 info1 = new Info2("백일호",17,'f',"010-8811-9559");
		Info2 info2 = new Info2("들국화",33);
		Info2 info3 = new Info2("맨드라미",'f',"010-9999-8888");
		Info2 info4 = new Info2("Anonymous");
		Info2 info5 = new Info2();
		
		info1.display();
		System.out.println();
		info2.display();
		System.out.println();
		info3.display();
		System.out.println();
		info4.display();
		System.out.println();
		info5.display();
	
		
		
		
		
	}

}









