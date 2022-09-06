package ja_0812;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RGbbar extends Frame implements AdjustmentListener{
	
	Panel pnl1 , pnl2 , pnl3 , pnl4;
	Label lab1 , lab2 , lab3;
	TextField txf1 , txf2 , txf3;
	Scrollbar scroll1 , scroll2 , scroll3;
	
	public RGbbar(String str) {
		super(str);
		go();
	}
	public void go() {
		setLayout(new GridLayout(2,1));
		
		pnl1 = new Panel();
		pnl2 = new Panel();
		
		lab1 = new Label("RED : ");
		lab2 = new Label("GREEN : ");
		lab3 = new Label("BLUE : ");
		
		txf1 = new TextField("0"); 
		txf2 = new TextField("0"); 
		txf3 = new TextField("0");
		
		scroll1 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		scroll2 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		scroll3 = new Scrollbar(Scrollbar.HORIZONTAL,0,15,0,270);
		
		add(pnl1,BorderLayout.CENTER);
		add(pnl2,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		pnl2.setLayout(null);
		
		pnl2.add(lab1);
		pnl2.add(txf1);
		pnl2.add(scroll1);
		lab1.setBounds(10,10,70,25);
		txf1.setBounds(80,10,100,25);
		scroll1.setBounds(180,10,230,25);
		scroll1.setBackground(new Color(100,10,10));
		scroll1.addAdjustmentListener(this);
		
		pnl2.add(lab2);
		pnl2.add(txf2);
		pnl2.add(scroll2);
		lab2.setBounds(10,35,70,25);
		txf2.setBounds(80,35,100,25);
		scroll2.setBounds(180,35,230,25);
		scroll2.setBackground(new Color(100,100,100));
		scroll2.addAdjustmentListener(this);
		
		pnl2.add(lab3);
		pnl2.add(txf3);
		pnl2.add(scroll3);
		lab3.setBounds(10,60,70,25);
		txf3.setBounds(80,60,100,25);
		scroll3.setBounds(180,60,230,25);
		scroll3.setBackground(new Color(200,100,100));
		scroll3.addAdjustmentListener(this);
		
		setSize(500,300);
		setVisible(true);
		
		
		
		
	}
	
	

	public void adjustmentValueChanged(AdjustmentEvent e) {
		int r,g,b;
		
		txf1.setText(Integer.toHexString(scroll1.getValue()).toUpperCase());
		txf2.setText(Integer.toBinaryString(scroll2.getValue()).toUpperCase());
		txf3.setText(Integer.toOctalString(scroll3.getValue()).toUpperCase());
		
		r = scroll1.getValue();
		g = scroll2.getValue();
		b = scroll3.getValue();
		
		pnl1.setBackground(new Color(r,g,b));
		
	}
	public static void main(String[] args) {
		new RGbbar("RGbbar~~");
	}

}









