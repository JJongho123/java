package ja_0809;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_4 extends Frame{
	public Graphics_4(String title) {
		super(title);
		
		XCanvas_1 grr = new XCanvas_1();
		
		grr.setSize(500,500);
		
		add("Center", grr);
		
		setSize(350, 350);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Graphics_4("Graphics Test");
	}
}
class XCanvas_1 extends Canvas {
	public void paint(Graphics g) {
		for (int i = 0; i < 500; i++) {
			
			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);
			
			int x = (int) (Math.random() * 300);
			int y = (int) (Math.random() * 300);
			
			int x2 = (int) (Math.random() * 300);
			int y2 = (int) (Math.random() * 300);
			
			int x3 = (int) (Math.random() * 60);
			int y3 = (int) (Math.random() * 60);
			
			int x4 = (int) (Math.random() * 360);
			int y4 = (int) (Math.random() * 360);
			
			g.setColor(new Color(red, green, blue));
			
			//g.drawLine(x, y, x2, y2);
			//g.fillRect(x, y, x2, y2);
			//g.fillRoundRect(x, y, x2, y2, x3, y3);
			//g.drawRoundRect(x, y, x2, y2, x3, y3);
			g.fillArc(x, y, x2, y2, x4, y4);
		}
	}
}