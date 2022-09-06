package ja_0801;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3 extends Frame {

	Label[] lbl = new Label[50];
	Button[] btn = new Button[50];

	public Button_3(String str) {
		super(str);
		setLayout(new FlowLayout());

		for (int i = 0; i < 50; i++) {

			lbl[i] = new Label(i + "레이블 ");
			btn[i] = new Button(i + "버튼");

			lbl[i].setBackground(new Color((int)(Math.random()*70), (int)(Math.random()*70),(int)(Math.random()*(250-150)+150)));

			btn[i].setBackground(new Color((int)(Math.random()*(250-150)+150), (int)(Math.random()*70), (int)(Math.random()*70)));
			
			lbl[i].setForeground(new Color((int)(Math.random()*256),0,0));
			btn[i].setForeground(new Color(0,0,(int)(Math.random()*256)));

			add(lbl[i]);
			add(btn[i]);
		}
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Button_3("배열 레이블 , 버튼만들기");
	}
}
