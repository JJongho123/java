package ja_0802;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar_2 extends Frame implements AdjustmentListener{
	
	Scrollbar red, green , blue ;
	Panel panel1 , panel2;
	
	public ScrollBar_2(String str){
		super(str);
		setLayout(null);
		red = new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,275);
		green = new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,275);
		blue = new Scrollbar(Scrollbar.HORIZONTAL,10,20,0,275);
		
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel2.setLayout(new FlowLayout());
		
		panel1.setLocation(20,40);
		panel1.setSize(350,200);
		panel2.setLocation(20,300);
		panel2.setSize(250,100);
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);
		
		add(panel1);
		add(panel2);
		
		setSize(350,350);
		setVisible(true);
		
		
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		panel1.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
		
		
		
		System.out.println("빨강:"+red.getValue());
		System.out.println("그린:"+green.getValue());
		System.out.println("블루:"+blue.getValue());
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new ScrollBar_2("스크롤바 테스트~");
	}

}




















