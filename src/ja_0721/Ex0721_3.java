package ja_0721;

import javax.swing.JOptionPane;

class Runnable22 implements Runnable {

	public void run() {
		for (int i = 10; i >= 0; i--) {

			System.out.println("\t\t" + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

		}

	}

	public class Ex0721_3 {
		public static void main(String[] args) {

			String input = JOptionPane.showInputDialog("아무거나 입력!!");
			System.out.println(" 입력하신값 : " + input + " 에요~~");
			
			Thread tt = new Thread(new Runnable22());
			tt.start();
		}
	}
}

















