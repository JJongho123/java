package ja_0728;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_1 {
	public static void main(String[] args) {
		
		Stack stt = new Stack();		//Stack 은 먼저들어간게 나중에 나온다.
		
		//LinkedList 는 Queue 인터페이스를 구현하였다.
		
		Queue qq = new LinkedList();	//Queue 는 먼저들어간게 먼저 나온다.
		
		stt.push("1");	// Stack 에 객체를 저장
		stt.push("2");
		stt.push("3");
		stt.push("4");
		
		qq.offer("1");	//	Queue 에 객체를 저장한다  성공하면 true 실패하면 false
		qq.offer("2");
		qq.offer("3");
		qq.offer("4");
		
		System.out.println("=========Stack==========");
		
		while(!stt.empty()) {
			System.out.println(stt.pop()); // 	Stack 의 맨위에 저장된 객체를 꺼낸다.
			
		}
		System.out.println("==========Queue===========");
		
		while(!qq.isEmpty()) {
			System.out.println(qq.poll());//	Queue 에서 꺼낸다 비어있으면 예외발생
		}
		
	}

}


















