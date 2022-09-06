package ja_0802;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3 extends Frame{
	
	Checkbox os1 , os2 , os3;
	Checkbox cpu1 , cpu2 , cpu3;
	CheckboxGroup cbg , cbg2;
	
	public Checkbox_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("설치되어 있는 OS 선택(복수) ",Label.CENTER);
		add(lbl1);
		
		os1 = new Checkbox("윈도우 98",true);
		os2 = new Checkbox("윈도우 2000",false);
		os3 = new Checkbox("윈도우 xp");
		
		add(os1);
		add(os2);
		add(os3);
		
		Label lbl2 = new Label("컴퓨터 CPU 종류 선택 ",Label.CENTER);
		
		lbl1.setBackground(new Color(125,255,255));
		lbl2.setBackground(new Color(255,125,255));
		add(lbl2);
		
		cbg = new CheckboxGroup();
		
		cpu1 =  new Checkbox("펜티엄4",cbg,false);		//체크박스는 모두 체크 가능하고 라디오박스는 한개만 체크가능하다.
		cpu2 = new Checkbox("에슬론",cbg,true);
		cpu3 = new Checkbox("듀어코어",cbg,false);
		
		add(cpu1);
		add(cpu2);
		add(cpu3);
		
		setSize(460,150);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new Checkbox_3("체크박스 테스트~~");
	}
	

}















