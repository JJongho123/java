package ja_0721;



public class Ex0721_2 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		MyThread5 tt = new MyThread5();
		
		tt.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i<300;i++) {
			System.out.print("--");
		}
		System.out.println("\n 소요시간11: "+(System.currentTimeMillis()-startTime)+"\n");
	}

}
class MyThread5 extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("||");
		}
		System.out.println("\n 소요시간11: "+(System.currentTimeMillis()-ThreadTest_5.startTime + "\n"));
	}
}
