package ja_0803;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame{
	
	FlowLayout fll = new FlowLayout();
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String str) {
		super(str);
		setLayout(fll);
		
		for(int i=0;i<10;i++) {
			btn[i] = new Button(i + " 번 버튼");
			add(btn[i]);
		}
		setBounds(100,100,200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
			new FlowLayout_1("FlowLayout Test");
	}

}
