package ja_0721;

public class MyPackage_33 {
	
	String nn;
	char cc;
	
	public MyPackage_33() {
		
	}
	
	
	public String getName() {
		return nn;
	}
	public char char1() {
		return cc;
	}
	public void display(String ss) {
		nn = ss;
		System.out.println("display () 메서드 호출");
		
	}
	public void display1(char cc) {
		this.cc = cc;
		System.out.println("display1 () 메서드 호출");
	}
}

	
	

