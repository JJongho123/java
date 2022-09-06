package ja_0720;

class MyThread extends Thread{
	public void run() {
		try {
			for(int i = 0; i<20; i++) {
				sleep(1000);	//1초를 멈추게함   sleep 은 무조건 예외처리 해줘야함
				System.out.println(" "+i+" * "+i+" = "+(i*i));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
}

public class ThreadTest_1 {
	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
//		thread.start();		//thread 호출
		thread.run();		//run() 메서드 호출
	}
}
