package ja_0721;

public class RunnableTest_33 implements Runnable {

	int delay;

	String title;

	public RunnableTest_33(String a) {
		title = a;
		System.out.println(" " + a + " 쓰레드 시작 ~~ ");
	}

	public static void main(String[] args) {

		Thread obj1 = new Thread(new RunnableTest_33(" 첫번째 "));
		Thread obj2 = new Thread(new RunnableTest_33(" @두번째@ "));
		Thread obj3 = new Thread(new RunnableTest_33(" ##세번째## "));

		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj3.setPriority(7);

		obj1.start();
		obj2.start();
		obj3.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("[" + i + "]" + title + "실행중!!!");
		}
		System.out.println(title + " 실행종료 ^^^^");
	}

}








