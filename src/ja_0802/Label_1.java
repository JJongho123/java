package ja_0802;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 {
	public static void main(String[] args) {
		
		Label lbl1,lbl2,lbl3,lbl4;
		
		Frame ff = new Frame(" 내가만든 레이블 ");
		
		ff.setLayout(new FlowLayout());
		
		lbl1 = new Label("봄");
		lbl2 = new Label("여 름");
		lbl3 = new Label("가 을");
		lbl4 = new Label("겨 울");
		
		ff.setBackground(new Color(255,120,255));
		lbl1.setBackground(new Color(128,255,255));
		lbl2.setForeground(new Color(120,120,255));
		
		
		ff.add(lbl1);
		ff.add(lbl2);
		ff.add(lbl3);
		ff.add(lbl4);
		
		ff.setSize(300,200);
		ff.setVisible(true);
		
	}

}
