package ja_0808;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextEvent_2 extends Frame {

	TextField txt;
	TextArea txt_area;

	
	public TextEvent_2(String str) {
		super(str);

		addWindowListener(new Handler_2());

		txt_area = new TextArea();
		txt = new TextField("", 20);

		txt.addTextListener(new Handler());
		txt.addActionListener(new Handler());

		txt_area.setFocusable(false);	//area 에 접근 불가시킴.
		
		txt_area.setEditable(false);	//area 에 수정 불가시킴.

		add("North", new Label(" 글자를 입력하고 Enter"));
		add("Center", txt_area);
		add("South", txt);

		setSize(300, 200);
		setVisible(true);
		setLocation(700, 300);

	}

	public static void main(String[] args) {
		new TextEvent_2("TextEvent test~");
	}

	class Handler_2 extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0); // 프로그램 종료	
		}
	}

	class Handler implements ActionListener, TextListener {

		public void actionPerformed(ActionEvent e) {

			txt.setText("");
			txt_area.append("\n");
		}

		public void textValueChanged(TextEvent e) {
		try {
			int i= txt.getText().length();
			if(i==0) {
				return;
			}
			txt_area.append(" "+txt.getText().charAt(i-1));
			
		}
		catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
			

		
	}
	}

}



