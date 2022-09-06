package ja_0721;

class Thread_8 extends Thread {

	public Thread_8(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + " 스레드 ");
		}
	}
}

public class ThreadTest_8 {
	public static void main(String[] args) {

		Thread_8 obj1 = new Thread_8("10번");
		Thread_8 obj2 = new Thread_8("  5번 ");
		Thread_8 obj3 = new Thread_8("      1번");
		Thread_8 obj4 = new Thread_8("     @@@@ 7번");

		obj1.setPriority(Thread.MAX_PRIORITY);		 // 1~10까지 넣을수있음.
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);

		System.out.println("a : " + obj1.getPriority());
		System.out.println("b : " + obj2.getPriority());
		System.out.println("c : " + obj3.getPriority());
		System.out.println("d : " + obj4.getPriority());
		// 우선순위 지정하지않으면 5를 부여 => setPriority(Thread.NORM_PRIORITY);

		obj3.start();
		obj2.start();
		obj1.start();
		obj4.start();

	}

}
