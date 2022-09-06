package ja_0721;

class Runnable_111 implements Runnable{
	String name;
	
	public Runnable_111(String name) {
		this.name = name;
	}
	public void run() {
		
		try{
			for(int i=0;i<5;i++) {
			
			Thread.sleep(1000);
			System.out.println(i+" 번 "+name+" : 스레드 ");
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}




public class Ex0721_1 {
	public static void main(String[] args) {
		
		Thread obj1 = new Thread(new Runnable_111("첫번째"));
		Thread obj2 = new Thread(new Runnable_111("두번째@@"));
		Thread obj3 = new Thread(new Runnable_111("세번째###"));
	
	
		obj1.start();
		obj2.start();
		obj3.start();
	}

}












