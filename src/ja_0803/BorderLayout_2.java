package ja_0803;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayout_2 extends Frame{
	
	public BorderLayout_2(String str) {
		super(str);
		
		Panel p = new Panel();
		
		
		p.setLayout(new GridLayout(3,1));	//grid 레이아웃 지정
		p.add(new Button("버튼 1"));
		p.add(new Button("버튼 2"));
		p.add(new Button("버튼 3"));
		
		
		add("North",new Label("레이아웃"));
		add("Center",p);
		add("South",new TextField("레이아웃 관리자 혼합",15));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new BorderLayout_2("BorderLayout 예제");
	}

}
