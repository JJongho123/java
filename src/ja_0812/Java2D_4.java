package ja_0812;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Java2D_4 extends Frame{
	
	Rectangle2D.Double rect;
	
	public Java2D_4(String str) {
		super(str);
		
		rect = new Rectangle2D.Double(100,30,100,150);
		
		setSize(350,450);
		setVisible(true);
		
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.draw(rect);
		
		g2.translate(100,50);	//	그래픽 컨텍스트의 원점을 현재의 좌표계의 점 (x, y) 으로 변환합니다.
		g2.rotate(Math.PI/6);
		
		g2.setColor(Color.orange);
		g2.fill(rect);
		
		g2.translate(100, 50);
		g2.rotate(Math.PI/8);
		
		g2.setColor(Color.cyan);
		g2.fill(rect);
		
		g2.translate(100, 50);
		g2.rotate(Math.PI/10);
		
		g2.setColor(Color.red);
		g2.fill(rect);
		
	}
	public static void main(String[] args) {
		new Java2D_4("Java2D_4");
	}

}
