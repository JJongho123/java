package ja_0805;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_4	extends Frame implements ActionListener{
	
	TextField txt_1 ,txt_2,txt_3;
	
	public ActionEvent_4(String str) {
		super(str);
		txt_1 = new TextField("문자를 입력하세요.",20);
		txt_2 = new TextField("...",20);
		txt_3 = new TextField("3번 ...",20);
		
		txt_1.addActionListener(this);
		txt_2.addActionListener(this);
		txt_3.addActionListener(this);
		
		add("North",txt_1);
		add("Center",txt_2);
		add("South",txt_3);
		
		setSize(300,300);
		setVisible(true);
		setLocation(700,300);
	}
	public static void main(String[] args) {
		new ActionEvent_4("Action Event test~~~");
	}

	@Override
	public void actionPerformed(ActionEvent e) {		// TextField 에서는 엔터키를 누르면 이벤트 발생
		
		TextField obj = (TextField) e.getSource();
		
		if(obj==txt_1) {
			txt_2.setText(txt_1.getText());
			txt_3.setText(txt_1.getText());
			
			txt_2.setFocusable(true);		//true 가 항상 맨위에있어야  setFocusabel() 메서드가 적용됨.
			txt_1.setFocusable(false);
			txt_3.setFocusable(false);
		}
		else if(obj == txt_2) {
			txt_1.setText(txt_2.getText());
			txt_3.setText(txt_2.getText());
			txt_3.setFocusable(true);
			txt_1.setFocusable(false);
			txt_2.setFocusable(false);
			
			
		}
		else {
			txt_1.setText(txt_3.getText());
			txt_2.setText(txt_3.getText());
			txt_1.setFocusable(true);
			txt_2.setFocusable(false);
			txt_3.setFocusable(false);
			
			
		}
		
	}

}

































