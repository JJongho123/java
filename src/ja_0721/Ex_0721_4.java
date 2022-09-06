package ja_0721;

class Runnable_5 implements Runnable {
	String name ;
	
	public Runnable_5 (String str) {
		name = str;
	}
	
	
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println (name + " 스레드 ");
		}
	}
}


public class Ex_0721_4 {
	public static void main(String[] args) {
		Thread obj1 = new Thread(new Runnable_5("10번"));
		Thread obj2 = new Thread(new Runnable_5("   5번"));
		Thread obj3 = new Thread(new Runnable_5("@@@1번"));
		
		obj1.setPriority(Thread.MAX_PRIORITY);		 // 1~10까지 넣을수있음.
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		obj3.start();
		obj2.start();
		obj1.start();
		
		


	}

}
