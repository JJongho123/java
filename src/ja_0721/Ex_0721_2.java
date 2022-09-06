package ja_0721;

public class Ex_0721_2 {
	public static void main(String[] args) {
		Runnable_3 obj = new Runnable_3();
		Thread tt = new Thread(obj);
		tt.start();
		
	}

}
class Runnable_3 implements Runnable{
	public void run() {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 500; i++) {
			System.out.print("--");
		}
		System.out.println("\n 소요시간 11:" + (System.currentTimeMillis() - startTime) + "\n");

		for (int i = 0; i < 500; i++) {
			System.out.print("||");
		}
		System.out.println("\n 소요시간 22:" + (System.currentTimeMillis() - startTime));
		
	}
}
