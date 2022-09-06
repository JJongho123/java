package ja_0721;


class MyThreadTest_3 extends Thread{
	public MyThreadTest_3(String name) {
		super(name);
	}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				
				Thread.sleep(1000);
				System.out.println(" "+i+" 번 "+getName()+" :스레드");
			}
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadTest_3 {
	public static void main(String[] args) {
		
		
		MyThreadTest_3 obj1 = new MyThreadTest_3("첫번쨰");
		MyThreadTest_3 obj2 = new MyThreadTest_3("두두번쨰");
		MyThreadTest_3 obj3 = new MyThreadTest_3("세세세번째");
		
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}

}









