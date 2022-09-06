package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3_1 extends Frame implements ActionListener {

//	Label lbl1 = new Label() ;

	Button[] btn = new Button[9];
	Color[] color = { Color.red, Color.orange, Color.yellow, 
			Color.green, Color.magenta, Color.cyan, Color.gray,
			new Color(0, 125, 225), new Color(255, 125, 125) };

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	Panel pnl3 = new Panel();
	Panel pnl4 = new Panel();

	String[] string = { "Red", "Orange", "Yellow", "Green", "Magenta", "Cyan", "Gray", "내가좋아하는색 1", "내가좋아하는색 222" };

	public ActionEvent_3_1(String str) {

		super(str);

		pnl4.setLayout(new GridLayout(1, 2));
//		add(lbl1);

		for (int i = 0; i < 9; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);

			pnl1.add(btn[i]);
		}
		pnl4.add(pnl2);
		pnl4.add(pnl3);

		add("North", pnl1);
		add("Center", pnl4);
		setSize(300, 200);
		setVisible(true);
		setLocation(700, 300);

	}

	public static void main(String[] args) {
		new ActionEvent_3_1("ActionEvent Test~");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Button obj = (Button) e.getSource();
		Object obj = e.getSource();

		for (int i = 0; i < 9; i++) {

			if (obj == btn[i]) {
				pnl2.setBackground(color[i]);
				pnl3.setBackground(color[(i + 1) % 9]);

			}

		}
	}
}













