package ja_0728;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex_0728_3 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Student_44("정종호", 1, 2));
		list.add(new Student_44("가나다",1,2));
		
		Iterator itt = list.iterator();
		
		while(itt.hasNext()) {
			Student_44 ss = (Student_44)itt.next();
			
			System.out.println(ss.name+"\t"+ss.ban+"\t"+ss.noo);
		}
		System.out.println();
		System.out.println();
		
//		for(Student_3 stu : list) {
//			System.out.println(stu.name+"\t"+stu.ban+"\t"+stu.noo);
//		}
		for(int i=0;i<list.size();i++) {
			Student_44 stt = (Student_44) list.get(i);
			System.out.println(stt.name+"\t"+stt.ban+"\t"+stt.noo);
			
			
//			System.out.println(list.get(i).(Student_3.name);
		}
		
	}

}

 class Student_44{		
	String name = "";
	int ban , noo;
	public Student_44(String name,int ban , int noo) {
		
		this.name = name;
		this.ban = ban;
		this.noo = noo;
		
		
	}
	
}






