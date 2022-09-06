package ja_0803;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class Font_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Font Test");
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Label abc1 = new Label(abc);
		Label abc2 = new Label(abc);
		Label abc3 = new Label(abc);
		Label abc4 = new Label(abc);
		Label abc5 = new Label(abc);
		Label abc6 = new Label(abc);
		
		Font ff1 = new Font("Serif",Font.PLAIN,20);
		Font ff2 = new Font("Serif",Font.ITALIC,20);
		Font ff3 = new Font("Serif",Font.BOLD,20);
		Font ff4 = new Font("Serif",Font.BOLD+Font.ITALIC,20);
		Font ff5 = new Font("Serif",Font.BOLD|Font.ITALIC,35);
		
		
		
//		Font ff1 = new Font("Papyrus",Font.PLAIN,20);
//		Font ff2 = new Font("Papyrus",Font.ITALIC,20);
//		Font ff3 = new Font("Papyrus",Font.BOLD,20);
//		Font ff4 = new Font("Papyrus",Font.BOLD+Font.ITALIC,20);	//효과를 동시에 주고싶을때 + 랑 | 를 준다 => 같은효과
//		Font ff5 = new Font("Papyrus",Font.BOLD|Font.ITALIC,35);
		
		abc1.setFont(ff1);
		abc2.setFont(ff2);
		abc3.setFont(ff3);
		abc4.setFont(ff4);
		abc5.setFont(ff5);
		
		ff.setLayout(new FlowLayout());
		
		ff.add(abc1);
		ff.add(abc2);
		ff.add(abc3);
		ff.add(abc4);
		ff.add(abc5);
		
		ff.setSize(700,350);
		ff.setVisible(true);
	}

}

















