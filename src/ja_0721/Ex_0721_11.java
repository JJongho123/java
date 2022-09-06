package ja_0721;

class Runnable_111 implements Runnable{
	String str;
	
	public Runnable_111(String name) {
		str = name;
	}
	
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				
				Thread.sleep(1000);
				System.out.println(" "+i+" 번 "+str+" :스레드");
			}
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}








public class Ex_0721_11 {
	public static void main(String[] args) {
		
		Thread tt = new Thread(new Runnable_111("첫번쨰"));
		Thread tt1 = new Thread(new Runnable_111("@@@두번쨰"));
		Thread tt2 = new Thread(new Runnable_111("####세번쨰"));
		tt.start();
		tt1.start();
		tt2.start();
		
	}

}







