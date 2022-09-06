package ja_0802;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_1 {
	public static void main(String[] args) {
		Frame ff = new Frame("Panel Test~~~");
		
		ff.setSize(300,500);
		ff.setLayout(null);
		
		Panel p1 = new Panel();
		p1.setBackground(new Color(125,255,255));
		p1.setSize(150,100);
		p1.setLocation(50,50);
		
		Panel p2 = new Panel();
		p2.setBackground(new Color(255,125,255));
		p2.setSize(150,100);
		p2.setLocation(50,170);
		
		Panel p3 = new Panel();
		p3.setBackground(new Color(255,255,125));
		p3.setSize(150,100);
		p3.setLocation(50,290);
		
		Button ok = new Button("OK");
		Label cancel = new Label("CANCEL ",Label.CENTER);
		
		p1.add(ok);
		p2.add(new Button("나 버튼"));
		p3.add(new Button("1번"));
		p3.add(new Button("2번"));
		p3.add(new Button("3번"));
		p1.add(cancel);
		
		ff.add(p1);
		ff.add(p2);
		ff.add(p3);
		
		ff.setVisible(true);
		
	}

}
















