package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 extends Frame implements ActionListener {


	Panel pnl1 , pnl2 ;
	Button[] btn = new Button[9];
	Color[] color = { Color.red, Color.orange, Color.yellow, Color.green, Color.magenta, Color.cyan, Color.gray ,
								new Color(0,125,225),new Color(255,125,125)};
	
	GridLayout grid = new GridLayout();
	String[] string = { "Red", "Orange", "Yellow", "Green", "Magenta", "Cyan", "Gray" ,"내가좋아하는색 1","내가좋아하는색 222"};

	public ActionEvent_3(String str) {
		
		super(str);
		pnl1 = new Panel();
		pnl2 = new Panel();
		setLayout(grid);

		for (int i = 0; i < 9; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);

			add(btn[i]);
		}
		add(pnl1);
		add(pnl2);
		setSize(300, 200);
		setVisible(true);
		setLocation(700,300);
		
	}

	public static void main(String[] args) {
		new ActionEvent_3("ActionEvent Test~");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button) e.getSource();
//		Object obj = e.getSource();
		
		for(int i=0;i<9;i++) {
			if(obj == btn[i]){
				this.setBackground(color[i]);
			}
		}
		System.out.println(e.getActionCommand()+"눌렸습니다.\n");
	}

}











