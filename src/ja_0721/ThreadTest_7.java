package ja_0721;

import javax.swing.JOptionPane;

class MyThread_7 extends Thread {
	public void run() {
		for (int i = 10; i >= 0; i--) {

			System.out.println("\t\t" + i);

			try {
				sleep(1000); // 상속받고 있기때문에 sleep앞에 Thread 생략가능
			} catch (InterruptedException e) {
				e.printStackTrace();
				// System.out.println(e.getMessage());
			}
		}
	}

public class ThreadTest_7 {
	public static void main(String[] args) {
		
		MyThread_7 obj = new MyThread_7();
		
		obj.start();
		
	String input = JOptionPane.showInputDialog(" 아무거나 입력~");
	System.out.println("입력한값 :"+input+" 입니다 ");
		
		
	}

}
}










