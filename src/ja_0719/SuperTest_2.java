package ja_0719;

class AA_5 {
	String str;
	boolean bbb;
	char sex = ' ';
	
	public AA_5(String str, boolean bbb , char sex) {
		this.str = str;
		this.bbb = bbb;
		this.sex = sex;

		System.out.println(" AA_5 생성자호출~~~ : " + str + "boolean :" + bbb);
	}
}

class BB_5 extends AA_5 {

	public BB_5(String aa, boolean bbb , char sex) {
		super(aa,bbb,sex);
		
		
		System.out.println(" BB_5 생성자호출@@@@@ : "+aa+"boolean :"+bbb);
	}
}

class CC_5 extends BB_5 {
	
	
	public CC_5(String kbs, boolean bbb , char sex) {
		super(kbs, bbb, sex);
//		super.sex = sex;
		System.out.println(" CC_5  생성자 호출%%%%%%%% : " + kbs + "boolean :" + bbb);
	}
}

public class SuperTest_2 {
	public static void main(String[] args) {

		CC_5 obj1 = new CC_5("즐거운 화요일 ", true,'m');
//		CC_5 obj2 = new CC_5("즐거운 수요일 ", false);

		System.out.println(obj1.str);
		System.out.println(obj1.bbb);
		System.out.println(obj1.sex);

	}

}
