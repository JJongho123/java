package ja_0802;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2 extends Frame{
	
	String[] continent = {"아시아","유럽","아메리카","아프리카","오세아니아"};
	String[] country = {"대한민국","영국","캐나다","이집트","호주"};
	String[] cc = {"한국수도","영국수도","캐나다수도","이집트수도","호주수도"};
	
	public Choice_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("대륙을 선택하세요!");
		Label lbl2 = new Label("나라를 선택하세요!!");
		Label lbl3 = new Label("수도를 선택하세요!@!!");
		
				
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		Choice choice3 = new Choice();
		
		for(int i=0;i<continent.length;i++) {
			choice1.add(continent[i]);
		}
		for(int i=0;i<country.length;i++) {
			choice2.add(country[i]);
		}
		for(int i=0;i<cc.length;i++) {
			choice3.add(cc[i]);
		}
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(choice1);
		add(choice2);
		add(choice3);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice_2("초이스 예제 2");
	}
	

}








