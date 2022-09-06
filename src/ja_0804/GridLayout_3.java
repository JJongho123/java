package ja_0804;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class GridLayout_3{
	public static void main(String[] args) {
		
	
	Frame ff = new Frame();
	ff.setLayout(new GridLayout(17,2));
//	ff.setLayout(new FlowLayout());
	
	Panel p1 = new Panel();		p1.setBackground(Color.black);
	Panel p2 = new Panel();		p2.setBackground(Color.blue);
	Panel p3 = new Panel();		p3.setBackground(Color.cyan);
	Panel p4 = new Panel();		p4.setBackground(Color.darkGray);
	Panel p5 = new Panel();		p5.setBackground(Color.gray);
	Panel p6 = new Panel();		p6.setBackground(Color.lightGray);
	Panel p7 = new Panel();		p7.setBackground(Color.magenta);
	Panel p8 = new Panel();		p8.setBackground(Color.orange);
	Panel p9 = new Panel();		p9.setBackground(Color.pink);
	Panel p10 = new Panel();		p10.setBackground(Color.red);
	Panel p11 = new Panel();		p11.setBackground(Color.white);
	Panel p12 = new Panel();		p12.setBackground(Color.yellow);
	Panel p13 = new Panel();		p13.setBackground(Color.green);
	
	Panel p14 = new Panel();		p14.setBackground(new Color(50,100,100));
	Panel p15 = new Panel();		p15.setBackground(new Color(125,255,255));
	Panel p16 = new Panel();		p16.setBackground(new Color(225,55,255));
	Panel p17 = new Panel();		p17.setBackground(new Color(100,100,100));

	ff.add(new Label("Color.black"));	ff.add(p1);
	ff.add(new Label("Color.blue"));	ff.add(p2);
	ff.add(new Label("Color.cyan"));	ff.add(p3);
	ff.add(new Label("Color.darkGray"));	ff.add(p4);
	ff.add(new Label("Color.lightGray"));	ff.add(p5);
	ff.add(new Label("Color.magenta"));	ff.add(p6);
	ff.add(new Label("Color.orange"));	ff.add(p7);
	ff.add(new Label("Color.pink"));	ff.add(p8);
	ff.add(new Label("Color.red"));	ff.add(p9);
	ff.add(new Label("Color.white"));	ff.add(p10);
	ff.add(new Label("Color.yellow"));	ff.add(p11);
	ff.add(new Label("Color.green"));	ff.add(p12);
	ff.add(new Label("Color.black"));	ff.add(p13);
	ff.add(new Label("Color.black"));	ff.add(p14);
	ff.add(new Label("Color.black"));	ff.add(p15);
	ff.add(new Label("Color.black"));	ff.add(p16);
	ff.add(new Label("Color.black"));	ff.add(p17);
	
	
	ff.setSize(250,300);
	ff.setVisible(true);
	
}
	



}














