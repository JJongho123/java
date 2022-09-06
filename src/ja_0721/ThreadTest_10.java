package ja_0721;

class Thread_10_1 extends Thread {

	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}
}

class Thread_10_2 extends Thread {

	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
}

class Thread_10_3 extends Thread {

	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("#");
		}
	}
}

public class ThreadTest_10 {
	public static void main(String[] args) throws Exception {

		Thread_10_1 obj1 = new Thread_10_1();
		Thread_10_2 obj2 = new Thread_10_2();
		Thread_10_3 obj3 = new Thread_10_3();

		obj1.start();

		obj1.join(); // join 을 사용하면 해당 스레드가 종료될때
						// 까지 기다리고 다음 스레드로넘어갑니다.

		obj2.start();
		
		obj3.start();
	}
}





