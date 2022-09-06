package ja_0721;

import javax.swing.JOptionPane;

public class Ex_0721_3 {
	public static void main(String[] args) {
		Runnable_4 obj = new Runnable_4();
		Thread tt = new Thread(obj);
		
		tt.start();
		
	}
}
class Runnable_4 implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; i--) {

			System.out.println("\t\t" + i);

			try {
				Thread.sleep(1000); // 상속받고 있기때문에 sleep앞에 Thread 생략가능
			} catch (InterruptedException e) {
				e.printStackTrace();
				// System.out.println(e.getMessage());
			}
		}
	}
}
		

		
	
				
			
				
	
	
	







