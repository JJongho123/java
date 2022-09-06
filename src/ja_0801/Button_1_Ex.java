package ja_0801;

import java.awt.Color;
import java.awt.Frame;

public class Button_1_Ex extends Frame{
	
	
	public Button_1_Ex(String str) {
		super(str);
		setBackground(new Color(255,255,0));
		setLocation(600,300);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Button_1_Ex("가나다라");
	}
	
	
	
	
}
