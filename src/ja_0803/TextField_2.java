package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	public TextField_2(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10,30);	//10행 30열의 글자를 담을수 있게 만든다.
		TextField txt2 = new TextField("안녕하세요",20);
		
		txt1.setText("문자열 입력~~");
		txt1.setBackground(new Color(125,255,255));
		txt1.setFont(new Font("궁서체",Font.ITALIC|Font.BOLD,17));
		txt1.setForeground(new Color(0,0,255));
		
		txt2.setEchoChar('*');
		txt2.setForeground(new Color(255,0,255));
		
		add(txt1);
		add(txt2);
		
		setSize(300,330);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		new TextField_2("텍스트 필드 2~2~2");
	}
	

}
