package ja_0719;

final class Single{
	
	private static Single ss = new Single();
	
	private Single() {}
	
	public static Single get() {
		if(ss==null) {
			
			ss = new Single();
		}
		return ss ;
	}
}

public class Singleton_Ex_1 {
	public static void main(String[] args) {
		
	
	
	Single ss1 = Single.get();
	Single ss2 = Single.get();
	

	System.out.println(ss1.hashCode());
	System.out.println(ss2.hashCode());
	}
}
	
	
	


