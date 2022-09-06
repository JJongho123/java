package ja_0720;

class Mythread2 extends Thread{
	public void run() {
		try {
			for(int i = 0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println(" "+i+" 번 쓰레드");
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}

public class Ex0720_1 {
	public static void main(String[] args) throws Exception{
		
		Mythread2 tt = new Mythread2();
		tt.start();
//		tt.run();
		
			for(int i =0; i<10;i++) {
				Thread.sleep(1000);
				System.out.println("              "+i+" main 쓰레드 !!!!!!!! ");
			}
		
		}
	}
