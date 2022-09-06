package ja_0801;

import java.awt.Color;
import java.awt.Frame;

public class Frame_2 extends Frame{
	public Frame_2(){
		super("아름다운 사람~~~~");
		setBackground(new Color(250,25,20));	//색깔
		setLocation(400,400);		//처음 나타날 위
		setSize(300,300);		//크기	
		setVisible(true);	
		
	}
	public static void main(String[] args) {
		new Frame_2();
	}

}
