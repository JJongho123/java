package ja_0721;

import java.util.Iterator;

public class RunnableTest_44 implements Runnable{
	
	private int[] temp;
	
	public RunnableTest_44() {
		temp = new int[10];
		
		for(int i=0;i<temp.length;i++) {
			//150 ~ 200 사이의 난수 발생
//			temp[i] = (int)(Math.random()*(200 - 150 + 1)+150);
			temp[i] = (int)(Math.random()*(51)+150);
			
		}
	}
	
	public static void main(String[] args) {
		
		RunnableTest_44 obj1 = new RunnableTest_44();
		Thread tt = new Thread(obj1);
		
		Thread tt2 = new Thread(new RunnableTest_44());
		
		tt.start();
		tt2.start();

	}
	@Override
	public void run() {
		for(int i=0;i<temp.length;i++)	
		{
				
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(" 쓰레드 이름 : "+Thread.currentThread().getName());
				System.out.println("temp[] value :"+temp[i]);
			}
				
		}
	}
		
//		for(int start : temp)	//향상된 for문
//		{
//			
//			try{
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			System.out.println(" 쓰레드 이름 : "+Thread.currentThread().getName());
//			System.out.println("temp[] value :"+start);
//		}
//			
//	}





















