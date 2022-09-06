package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_1 extends Frame implements ActionListener
{
	Label lbl_info;
	Button btn1 , btn2 ,btn3;
	
	public ActionEvent_1(String str){
		super(str);
		
	
		lbl_info = new Label("버튼을 눌러주세요");
		btn1 = new Button("◀ Button");
		btn2 = new Button("▶ Button");
		btn3 = new Button("● Button");
		
//		btn1.setBackground(Color.red);
//		btn2.setBackground(Color.darkGray);
//		btn3.setBackground(Color.pink);
//		
//		btn1.setForeground(Color.green);
//		btn2.setForeground(Color.orange);
//		btn3.setForeground(Color.yellow);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);	//	다른클래스에있으면 this 대신 new Handler 를 입력해준다.
		btn3.addActionListener(this);	//	다른클래스에있으면 this 대신 new Handler 를 입력해준다.
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		
		add("Center",panel);
		add("South",lbl_info);
		
		setSize(300,200);
		setVisible(true);
		setLocation(600,300);
		panel.setBackground(new Color(125,255,255));
		
		
	}
	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent Test~");
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();	//이벤트가 처음 발생한 개체
		
		if((Button) obj == btn1)
		{
			lbl_info.setText("왼쪽버튼이 눌렸습니다.");
			System.out.println("왼쪽버튼이 눌렸습니다.");
		}
		else if((Button) obj == btn2) {
			lbl_info.setText("오른쪽버튼이 눌렸습니다.");
			System.out.println("오른쪽버튼이 눌렸습니다.");
		}
		else {
			lbl_info.setText("가운데 버튼이 눌렸습니다.");
			System.out.println("가운데 버튼이 눌렸습니다.");
		}
			
	
	}

}














