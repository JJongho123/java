package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 extends Frame {

	Panel n, w, e, c, s;

	public Panel_3(String str) {
		super(str);

		n = new Panel();
		w = new Panel();
		e = new Panel();
		c = new Panel();
		s = new Panel();

		n.setBackground(new Color(125, 25, 25));
		w.setBackground(new Color(125, 25, 255));
		e.setBackground(new Color(125, 255, 55));
		c.setBackground(new Color(25, 255, 255));
		s.setBackground(new Color(225, 55, 55));

		n.add(new Button("패널1"));
		w.add(new Button("패널2"));
		e.add(new Button("패널3"));
		c.add(new Button("패널4"));
		s.add(new Button("패널5"));

		add("North", n);
		add("West", w);
		add("East", e);
		add("Center", c);
		add("South", s);

		setSize(500, 500);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Panel_3("패널3~~~");
	}

}
