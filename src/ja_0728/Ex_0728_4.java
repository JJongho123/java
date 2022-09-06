package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_0728_4 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Student_33("백일 홍",1,1,100,90,80));
		list.add(new Student_33("해당 화",1,2,67,77,83));
		list.add(new Student_33("나팔 꽃",1,3,79,36,56));
		list.add(new Student_33("달맞이꽃",1,4,66,77,88));
		list.add(new Student_33("들국 화",2,1,73,52,64));
		list.add(new Student_33("패랭이꽃",2,2,90,27,64));
		list.add(new Student_33("코스모스",2,3,87,84,34));
		list.add(new Student_33("히야신스",2,4,77,59,63));
		
		Iterator itt = list.iterator();
		
		while(itt.hasNext()) {
			Student_33 stt = (Student_33)itt.next();
			
			System.out.println(stt);
		}
		
	}
}
class Student_33 implements Comparable<Student_33>{
	
	String name = "";
	int ban ,no,kor,eng,math,total;
	
	public Student_33(String name,int ban ,int no ,int eng , int math , int kor) {
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.eng = eng;
		this.math = math;
		this.kor = kor;
		
		total = kor + eng + math;
		
	}
	public String toString() {
		return name +"\t"+ban+"\t"+ no +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ total;
	}
	public int compareTo(Student_33 stt) {
		return this.total - stt.total;
	}
	
	
	
}


















