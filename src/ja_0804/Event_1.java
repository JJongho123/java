package ja_0804;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event_1 extends Frame implements ActionListener {

	
	public Event_1(String str) {
		super(str);
		Button btn = new Button("버튼~~");
		btn.addActionListener(this);
		
		add(btn);
		setSize(300,300);
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("***** 이벤트 발생 경보 *****");
		System.out.println("e.getSource() 메서드: "+e.getSource());
		System.out.println("e.toString() : "+e.toString());
		System.out.println("e.getID() :"+e.getID());
		System.out.println("e.paramString() : " +e.paramString());
		System.out.println("*******************************");
		
		
	}
	public static void main(String[] args) {
		new Event_1("Event test~~~");
	}

}
