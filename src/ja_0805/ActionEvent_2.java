package ja_0805;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_2  extends Frame implements ActionListener{

	Button btn1, btn2, btn3 ;
	TextArea txt_info ;
//	TextArea txt_info =   new TextArea("~~버튼을 눌러주세요~~\n");
	
	
	public ActionEvent_2(String str) {
		super(str);
		
		txt_info = new TextArea("~~버튼을 눌러주세요~~\n");	//14번 코드로도 사용가능
		btn1 = new Button("◀ Button");
		btn2 = new Button("▶ Button");
		btn3 = new Button("$ Button");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		add("Center",txt_info);
		add("South",panel);
		
		setSize(300,200);
		setVisible(true);
		
		setLocation(700,300);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		txt_info.append(e.getActionCommand()+"눌렸습니다. \n"); 
		// e.getActionCommand()메서드는 버튼을 눌렀을때 텍스트를 가져와준다.
		System.out.println(e.getActionCommand()+"눌렸습니다.");
		
	}
	
	public static void main(String[] args) {
		new ActionEvent_2("ActionEvent Test@@");
	}

}
  














