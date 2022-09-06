package ja_0725;

class Info3 {
	private String name;
	private int age;
	private char sex;
	private String tel;

	public Info3(String name, int age, char sex, String tel) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
	}

	public Info3(String name, int age) {
		this.name = name;
		this.age = age;
		sex = 'm';
		tel = "01022212";

	}

	public Info3(int age, char sex) {
		this.age = age;
		this.sex = sex;
		name = "가나다";
		tel = "010101010";
		
	}

	public void display() {
		System.out.println(" 이름은 :" + name);
		System.out.println(" 나이는 :" + age);
		System.out.println(" 성별은 :" + sex);
		System.out.println(" 번호는 :" + tel);
	}
}

public class Ex_0725 {
	public static void main(String[] args) {

		Info3 aa1 = new Info3("정종호",29,'m',"010");
		Info3 aa2 = new Info3("권인숙",39);
		Info3 aa3 = new Info3(99,'f');
		
		aa1.display();
		aa2.display();
		aa3.display();
		
		
	}

}



