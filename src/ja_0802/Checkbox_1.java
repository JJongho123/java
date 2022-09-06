package ja_0802;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1 extends Frame {

	public Checkbox_1(String str) {
		super(str);
		setLayout(new FlowLayout());

		Checkbox cbx_1 = new Checkbox("남자", false);
		Checkbox cbx_2 = new Checkbox("여자", true);

		add(cbx_1);
		add(cbx_2);

		setSize(200, 200);
		setVisible(true);
		setBackground(new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250)));
		setForeground(new Color(125,255,255));
		setLocation(500,500);
		
		

	}

	public static void main(String[] args) {

		new Checkbox_1("체크박스 테스트~~");

	}

}
