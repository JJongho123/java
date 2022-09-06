package ja_0721;

public class Ex_0721_13 implements Runnable{
	
	private int[] temp;
	
	public Ex_0721_13() {
		temp = new int[10];
		
		System.out.println("***"+temp.length);
		
		for(int i=0;i<temp.length;i++) {
			temp[i] = (int)(Math.random()*(200-150+1)+150);
		}
	}
	public static void main(String[] args) {
		
		Thread tt = new Thread(new Ex_0721_13());
		tt.start();
		
	}
	public void run()  {
		for(int i=0;i<temp.length;i++) {
			
			try {
			Thread.sleep(1000);}
			catch(Exception e) {
				
			}
			System.out.println(" 쓰레드 이름 : "+Thread.currentThread().getName());
			System.out.println("temp[] value :"+temp[i]);
		}
	}
	
	
	

}
