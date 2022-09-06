package ja_0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1 extends Frame {
//	-Dfile.encoding=MS949
	Button bnt1 , bnt2 , bnt3;

	public Button_1(String str) {
		
		super(str);
		setLayout(new FlowLayout());		//FlowLayout = >  좌우로 배치하다가 공간이없으면 내려간다 
		
		bnt1 = new Button(" 가 위 ");
		bnt2 = new Button(" 바 위 ");
		bnt3 = new Button(" 보 ");
		
		add(bnt1);
		add(bnt2);
		add(bnt3);
		
		setSize(300,300);
		setVisible(true);
		setLocation(400,400);
	}
	public static void main(String[] args) {
		new Button_1("가위바위보");
	}
}
	

