package ja_0802;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class List_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("List - Select");
		ff.setSize(500,400);
		ff.setLayout(null);
		ff.setLayout(new FlowLayout());		//FlowLayout 을 해주면 밑에서의 Location 값이 의미가 없어진다.
		
		List selectOne = new List(4);
		
		selectOne.setLocation(20,40);
		selectOne.setSize(150,80);
		
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");
		
		List selectMany = new List(5,true);
		selectMany.setLocation(20,170);
		selectMany.setSize(150,100);
		
		selectMany.add("Student");
		selectMany.add("Teacher");
		selectMany.add("Driver");
		selectMany.add("Computer Programmer");
		selectMany.add("Sales Man");
		selectMany.add("Musician");
		selectMany.add("Director");
		
		ff.add(selectOne);
		ff.add(selectMany);
		
		List selectMany1 = new List(3);
		selectMany1.setLocation(180,90);
		selectMany1.setSize(150,100);
		
		selectMany1.add("Student");
		selectMany1.add("Teacher");
		selectMany1.add("Driver");
		selectMany1.add("Computer Programmer");
		selectMany1.add("Sales Man");
		selectMany1.add("Musician");
		selectMany1.add("Director");
		
		ff.add(selectOne);
		ff.add(selectMany);
		ff.add(selectMany1);
		
		ff.setVisible(true);
		
		
		
		
	}

}
