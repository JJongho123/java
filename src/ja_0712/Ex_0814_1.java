package ja_0712;

class Static{
	static int num = 0;
	int xx = 0;
	int yy = 0;
	
}
public class  Ex_0814_1{
	public static void main(String[] args) {
		
		Static ss1 = new Static();
		Static ss2 = new Static();
		Static ss3 = new Static();
		
		Static.num = 88;
		ss1.xx = 43;
		ss2.yy = 57;
		
		System.out.println(" \n ss1.num ="+ss1.num +"\n ss1.xx ="+ss1.xx+"\n ss1.yy ="+ss1.yy);
		
		Static.num = 999;
		ss2.xx = 233;
		ss2.yy = 345;
		
		
		
		
	}
	
	
	
	
	}



































	
	