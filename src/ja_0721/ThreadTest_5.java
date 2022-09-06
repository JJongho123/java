package ja_0721;

public class ThreadTest_5 {

	static long startTime = 0;

	public static void main(String[] args) {

		MyThread_5 thread1 = new MyThread_5();

		thread1.start();

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++) {
			System.out.print("--");
		}
		System.out.println("\n 소요시간 11:" + (System.currentTimeMillis() - startTime) + "\n");

	}

}

class MyThread_5 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("||");
		}
		System.out.println("\n 소요시간 22:" + (System.currentTimeMillis() - ThreadTest_5.startTime + "\n"));
	}

}















