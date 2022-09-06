package ja_0728;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_5 {
	public static void main(String[] args) {
		
		ArrayList<Student_3> list = new ArrayList<Student_3>();
		
		list.add(new Student_3("수선화","1반",1));
		list.add(new Student_3("백  합","1반",2));
		list.add(new Student_3("장  미","1반",3));
		list.add(new Student_3("코스모스","2반",1));
		list.add(new Student_3("해바라기","2반",2));
		list.add(new Student_3("꽃꽃꽃꽃","2반",3));
		
		Iterator<Student_3>itt = list.iterator();
		while(itt.hasNext()) {
			
			Student_3 ss = itt.next();
			
			
			System.out.print(ss.name + "\t"+ss.ban+"\t"+ss.noo+"\n");
		}
		System.out.println();
		System.out.println();
		
		for(Student_3 stu:list) {		//향상 for문은 배열과 컬렉션에서만 가능하다.
			System.out.println(stu.name+ "\t"+stu.ban+"\t"+stu.noo);
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<list.size();i++) {
//			Student_3 stt = list.get(i);
//			System.out.println(stt.name);	
// 			위 두줄을 이와같이 축약할수 잇다 => System.out.println(list.get(i).name);
			
			System.out.println(list.get(i).name+ "\t"+list.get(i).ban+"\t"+list.get(i).noo);
		}
		
	}

}
class Student_3{
	String name = "";
	String ban = "";
	int noo;
	public Student_3(String name,String ban,int noo) {
		
		this.name = name;
		this.ban = ban;
		this.noo = noo;
		
	}
}



























