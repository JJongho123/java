package ja_0808;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Container_1 extends Frame implements ContainerListener , ActionListener{

	Panel panel;
	Button btn , btn_s1 , btn_s2;
	
	public Container_1(String str) {
		super(str);
		
		panel = new Panel();
		panel.setSize(200,200);
		add("Center",panel);
		
		panel.addContainerListener(this);
		
		btn = new Button("컴포넌트 추가!");
		
		btn.addActionListener(this);
		add("South",btn);
		
		setSize(300,300);
		setVisible(true);
		setLocation(700,300);
	}
	public static void main(String[] args) {
		new Container_1("Container Test ");
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if(e.getActionCommand().equals("컴포넌트 추가!")) {
			panel.add(btn_s1 = new Button("추가된 버튼"));
			panel.add(btn_s2 = new Button("또또추가된 버튼"));
			setVisible(true);
			btn.setLabel("컴포넌트 제거!");
			
		}
		else {
//			panel.remove(btn_s1);	//패널의 버튼 s1만 지운다.
//			panel.remove(btn_s2);	//패널의 버튼 s2만 지운다.
			panel.removeAll();		//페널에 있는것을 모두다 지운다.
			btn.setLabel("컴포넌트 추가!");
		}
		
	}

	public void componentAdded(ContainerEvent e) {
		setTitle("컨테이너에 컴포넌트 추가!!");
		
		
	}

	public void componentRemoved(ContainerEvent e) {
		setTitle("컨테이너에서 컴포넌트 제제거^^^^^");
	}

}














