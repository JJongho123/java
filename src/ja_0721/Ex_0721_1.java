package ja_0721;

class Runnable_11 implements Runnable{
	String str;
	
	public Runnable_11(String name){
		
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
	public class Ex_0721_1 {
		public static void main(String[] args) {
			
			Runnable_11 obj = new Runnable_11("첫번째");
			Thread tt = new Thread(obj);
			
			tt.start();
			
		}
	}
			








