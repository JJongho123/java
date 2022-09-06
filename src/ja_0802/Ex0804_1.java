package ja_0802;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ex0804_1 {
	public static void main(String[] args) {
		
		
		Frame ff = new Frame("DIalog");
		Dialog info = new Dialog(ff,"새로운소식",false);
		
		info.setSize(240,190);
		info.setLocation(100,100);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("@@@@",Label.CENTER);
		Button btn = new Button("OK");
		
		info.add(btn);
		info.add(msg);
		
		ff.setSize(300,300);
		ff.setVisible(true);
		info.setVisible(true);	
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}