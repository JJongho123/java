package ja_0721;

public class Ex_0721_5 {
	public static void main(String[] args) {

		Thread tt1 = new Thread(new Runnable_6_1());
		Thread tt2 = new Thread(new Runnable_6_2());
		
		tt1.start();
		tt2.start();
		
	}

}

class Runnable_6_1 implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("@@");
			for (int j = 0; j < 10000000; j++) {
				;
			}
		}

	}
}

class Runnable_6_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print("^^");
			for (int j = 0; j < 10000000; j++) {
				;
			}
		}
	}
}