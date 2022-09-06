package ja_0721;

public class ThreadTest_9 {
	public static void main(String[] args) {
		
		Thread_9_1 obj1 = new Thread_9_1();
		Thread_9_2 obj2 = new Thread_9_2();
		
		obj1.setPriority(10);
		obj2.setPriority(1);
		
		obj2.start();
		obj1.start();
		
	}

}

class Thread_9_1 extends Thread{
	
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print("@@");
			for(int j=0;j<10000000;j++) {
				;
			}
		}
	}
}
class Thread_9_2 extends Thread{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print("^^");
			for(int j=0;j<10000000;j++) {
				;
			}
		}
	}
}


















