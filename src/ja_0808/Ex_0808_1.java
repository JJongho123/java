package ja_0808;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex_0808_1 extends Frame implements TextListener {

	TextField txt ;
	Label lbl_info ;
	
	public Ex_0808_1(String str) {
		super(str);
		
		txt = new TextField("텍스트 입력 ... ",20);
		txt.addTextListener(this);
		txt.selectAll();
		
		lbl_info = new Label("          ");
		add("Center",lbl_info);
		add("South",txt);
		
		setSize(300,300);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new Ex_0808_1("Ex_0808_1");
	}
	


	public void textValueChanged(TextEvent e) {
		lbl_info.setText(txt.getText());
	}
	}




































