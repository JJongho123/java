package ja_0727;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {
	public static void main(String[] args) {
		
//		int i;
		
		Date date = new Date();
		
		Vector vv = new Vector(3,5);	//	5씩 증가 시키겟다.
		
		vv.addElement("Java");
		vv.add(new Double(56.7));
		vv.addElement(date);
		
		System.out.println("========== 3 개의 객체 추가================");
		
		System.out.println("size 11 : "+vv.size()+", capacity :"+vv.capacity());
		
		System.out.println("========================");
		
		for(int j=0; j<10;j++) {
			vv.add(new Integer(j+1));
		}
		vv.add("korea");
		
		System.out.println("======== 10개의 객체 추가 =============== ");
		
		System.out.println("size22 : "+ vv.size()+" , capacity : "+vv.capacity());
		
		System.out.println("----------------Vector 내용 출력 --------------");
		
		Enumeration enu = vv.elements();	//	Enumeration 는 열거형이다.
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement()+" ");
		}
		System.out.println("=============객체 포함 확인 ===============");
		
		if(vv.contains("Javar")) {	//contains  객체안에 문자열이 포함됫는지 찾아주는 메서드
			System.out.println("Javar 문자열 포함됨");
		}
		else
			System.out.println("Javar 문자열 포함 안안댐");
		System.out.println(" 56.7 객체 위치 : "+vv.indexOf(new Double(56.7)));	
		//-1이 결과로 나오면 값이 없다는 뜻이다.
		
		System.out.println("\n 입력시간 : "+vv.get(vv.indexOf(date)));
		
		//date 객체 삭제
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for(int j =0; j< vv.size();j+=3) {
			vv.removeElementAt(j);
		}
		vv.setElementAt("seoul",2);	//3번째 위치에 seoul 문자열 추가
		
		enu = vv.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement()+" ");
		}
		System.out.println("\n size : "+vv.size()+" , capacity : "+vv.capacity());
		
		vv.trimToSize();
			
		System.out.println("\n size : "+vv.size()+" , capacity : "+vv.capacity());
			
		vv.setSize(3);	//크기를 3으로 조정
		
		enu = vv.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement()+" ");
		}
		vv.removeAllElements();	//모든 객체 제거
		
		System.out.println("\n size : "+vv.size()+" , capacity : "+vv.capacity());
	
	}
	

}






















