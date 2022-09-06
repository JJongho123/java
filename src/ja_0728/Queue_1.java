package ja_0728;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
	public static void main(String[] args) {
	
	int time = 10;
	Queue qq = new LinkedList();
	
//	for(int i = 0 ;i<time;i++) {		//Queue 에서 offer 나 add 나 똑같다.
//		qq.add(i);
//	}
	for(int i = 1;i<time;i++) {
		qq.offer(i);
	}
	System.out.println(qq.peek());
	System.out.println(qq);
//	큐 안에 넣을때에는 Queue 명.offer (값) ;
//	큐에서 값을 빼낼때에는 Queue명.poll();
	
	while(!qq.isEmpty()) {
		System.out.println(qq.poll()+" aaa ");
//		System.out.println(qq.remove()+ " 333 ");	//poll 대신 remove 도 사용가
		System.out.println(qq);
		
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	
		
		
		
		
		
		
		
	}

}
