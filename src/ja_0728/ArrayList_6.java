package ja_0728;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_6 {
	public static void main(String[] args) {
		
		ArrayList<Student_4> list = new ArrayList<Student_4>();
		
		list.add(new Student_4("백일 홍",1,1,100,90,80));
		list.add(new Student_4("해당 화",1,2,67,77,83));
		list.add(new Student_4("나팔 꽃",1,3,79,36,56));
		list.add(new Student_4("달맞이꽃",1,4,66,77,88));
		list.add(new Student_4("들국 화",2,1,73,52,64));
		list.add(new Student_4("패랭이꽃",2,2,90,27,64));
		list.add(new Student_4("코스모스",2,3,87,84,34));
		list.add(new Student_4("히야신스",2,4,77,59,63));
		
		Collections.sort(list);			//정렬
		
		Iterator<Student_4> itt = list.iterator();
		
		while(itt.hasNext()) {
			Student_4 stt = itt.next();
			
			System.out.println(stt);
		}
		
		
	}

}
class Student_4 implements Comparable<Student_4>{
	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int total = 0;
	
	public Student_4(String name,int ban ,int no, int kor ,int eng , int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng+ math;
	}
	public String toString() {
		return name +"\t"+ban+"\t"+ no +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ total;
	}
//	객체의 정렬기준을 정의하는 첫번째 방법은 정령 대상 클래스를 자바에서
//	기본적으로 제공 하고 있는 Comparable 인터페이스를 구현하도록 변경하는 것입니다.
//	
//	Comparable 인터페이스의 compareTo() 메서드를 통해 인자로 넘어온
//	같은타입의 다른객체와 대소 비교가 가능합니다.
//	메서드를 호출하는 객체가 인자로 넘어온 객체보다
//	작을 경우에는 음수를 리턴하고 , 크기가 동일하다면 0,
//	클경우에는 양수를 리턴합니다.
	public int compareTo(Student_4 stt) {
		return   this.total - stt.total ;
	}
	
}
	
	

	




















