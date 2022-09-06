

package ja_0803;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;


public class Panel_4 extends Frame{
	
	public Panel_4(String str){
		super(str);
		
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(4,2));		//4행 2열의 격자 무늬의 레이아웃을 만든다.
		
		panel1.setBackground(new Color(125,255,255));
		
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스",true));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우110"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		
		Panel panel2 = new Panel();
		
		
		panel2.setBackground(new Color(255,255,0));
		
		panel2.add(new Label("환경설정",Label.CENTER)).setForeground(new Color(255,255,0));
//		Label lbl = new Label("환경설정");
//		lbl.setForeground(new Color(255,0,0));
//		panel2.add(lbl);	//위와 같은 방법
		panel2.add(new Button("불러오기"));
		panel2.add(new Button("저 장"));
		panel2.add(new Button("다른이름으로 저장"));
		
		add("North",panel1);
		add("Center",panel2);
		
		setSize(450,180);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Panel_4("패널 4~");
	}
}
















