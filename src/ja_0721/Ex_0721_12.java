package ja_0721;

public class Ex_0721_12 {

	static long startTime = 0;

	public static void main(String[] args) {
		Thread tt = new Thread(new Runnable_222());
		tt.start();

	}

}

class Runnable_222 implements Runnable {
	static long startTime = 0;

	public void run() {

		startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++) {
			System.out.print("--");
		}
		System.out.println("\n 소요시간 11:" + (System.currentTimeMillis() - startTime) + "\n");

		for (int i = 0; i < 500; i++) {
			System.out.print("|");
		}
		System.out.println("\n 소요시간 22: " + (System.currentTimeMillis() - startTime + "\n"));
	}
}