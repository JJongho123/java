package ja_0808;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ComponentListener , ActionListener{
	
	TextArea txt;
	Button btn;
	
	public Component_1(String str) {
		super(str);
		
		btn = new Button("화면에서 잠시 사라짐~~");
		btn.addActionListener(this);
		
		add("South",btn);
		
		txt = new TextArea();
		add("Center",txt);
		addComponentListener(this);	// 앞에 아무것도 안쓰고 그냥  add하면 Frame 에 적용됨.
		
		setSize(300,300);
		setVisible(true);
		setLocation(700,300);
	}
	public static void main(String[] args) {
		new Component_1("Component Test");
	}

	public void componentResized(ComponentEvent e) {
		txt.append("컴포넌트 크기 변경~~~ \n");
		
	}

	public void componentMoved(ComponentEvent e) {
		txt.append(" 컴포넌트 이동동 변경 %%% \n");
	}

	public void componentShown(ComponentEvent e) {
		txt.append(" 컴포넌트가 화면에 나타남 ^^^^^ \n");
	}

	public void componentHidden(ComponentEvent e) {
		txt.append(" 컴포넌트가 숨겨짐짐짐 &&&& \n" );
	}

	public void actionPerformed(ActionEvent e) {
		
		try {
			this.setVisible(false);
			
			Thread.sleep(3000);			//3초
			
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		this.setVisible(true);
	}

}




























