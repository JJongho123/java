package ja_0719;

interface AA_2 {
	int kbs = 999;	// static final int kbs = 999;
}

class BB_2 implements AA_2 {

	int sbs = 789;
	int mbc = 345;
}

public class InterfaceTest_2 {
	public static void main(String[] args) {

		BB_2 obj1 = new BB_2();

		obj1.sbs = 111;
		obj1.mbc = 333;

		System.out.println(" kbs 11 = " + obj1.kbs);
		System.out.println(" kbs 22 = " + AA_2.kbs);
		System.out.println(" mbc = " + obj1.mbc);
		System.out.println(" sbs = " + obj1.sbs);
	}

}
