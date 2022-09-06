package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_4 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Questions");
		
		ff.setSize(280,260);
		
		ff.setLayout(new FlowLayout());
		
		Label q1 = new Label(" 1. 당신의 관심 분야는? (여러개 선택가능)");
		Checkbox news = new Checkbox("news",true);
		Checkbox sports = new Checkbox("sports",false);
		Checkbox movies = new Checkbox("movies",false);
		Checkbox music = new Checkbox("music");
		
		ff.add(q1);
		ff.add(news);
		ff.add(sports);
		ff.add(movies);
		ff.add(music);
		
		Label q2 = new Label(" 2. 얼마나 자주 극장에 가십니까??");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox movie1 = new Checkbox("달에 한번갑니다",group,true);
		Checkbox movie2 = new Checkbox("두번갑니다",group,false);
		Checkbox movie3 = new Checkbox("세번갑니다",group,false);
		
		ff.add(q2);
		ff.add(movie1);
		ff.add(movie2);
		ff.add(movie3);
		
		
		Label q3 = new Label(" 3. 얼마나 자주 컴퓨터를 사용 하십니까 ?");
		CheckboxGroup group2 = new CheckboxGroup();
		Checkbox com1 = new Checkbox("5시간이하",group2,true);
		Checkbox com2 = new Checkbox("10시간이하",group2,false);
		Checkbox com3 = new Checkbox("15시간이하",group2,false);
		
		ff.add(q3);
		ff.add(com1);
		ff.add(com2);
		ff.add(com3);
		
		ff.setVisible(true);
		
		System.out.println("Hello World ! ");
			
		
		
		
		
		
	}

}
