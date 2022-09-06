package consoleCaculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator_Ex extends Frame {
	
	
	
	TextField txtf;
	
	public Calculator_Ex(String str) {
		super(str);
		setLayout(new GridLayout(4,4));
		
		txtf = new TextField();
		txtf.setEditable(false);
		txtf.setBackground(Color.gray);
		txtf.setVisible(true);
		txtf.setBounds(8,10,270,70);
		
		Panel buttons_panel = new Panel();
		String buttons_name[] = { "C", "/", "*", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
		Button buttons[] = new Button[buttons_name.length];
		
		for(int i=0;i<buttons_name.length;i++) {
			
		}
		
		
		add(txtf);
		
		
		
		
		
}
	
	public static void main(String[] args) {
		new Calculator_Ex(" 계 산 기 ");
	}

}
