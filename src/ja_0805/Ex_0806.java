package ja_0805;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex_0806 extends Frame implements ActionListener {

	Panel pnl1, pnl2 ,pnl3;
	Button[] btn = new Button[5];
	Color[] color = { Color.red, Color.orange, Color.yellow, Color.green, Color.gray };
	String[] string = { "red", "orange", "yellow", "green", "gray" };
	
	
	public Ex_0806(String str) {
		super(str);
		setLayout(new GridLayout());
			
		pnl1 = new Panel();
		pnl2 = new Panel();
		pnl3 = new Panel();
		
		
		for (int i = 0; i < 5; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);

			pnl1.add(btn[i]);

		}
		
		
		
		add(pnl1);
//		add("North",pnl1);
//		add("Center",pnl2);
		setSize(300, 300);
		setVisible(true);
		setLocation(700, 300);

	}
	public static void main(String[] args) {
		new Ex_0806("@@@@");
		
	}

	public void actionPerformed(ActionEvent e) {
			
		Object obj = e.getSource();
		for(int i=0;i<5;i++) {
			if(obj==btn[i]) {
				pnl1.setBackground(color[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
}
