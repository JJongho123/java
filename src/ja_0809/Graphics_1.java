package ja_0809;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame {
	public Graphics_1 (String title) {
		super(title);
		
		setSize(300, 250);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawLine(20, 10, 200, 200); //선
		g.drawRect(10, 35, 100, 100); //사각형
		g.drawOval(50, 50, 100, 100); //원
		g.drawArc(100, 100, 80, 80, 90, -180); //원홀, 다섯번째 자리가 시작 각도
	}
	public static void main(String[] args) {
		new Graphics_1("Graphics Test");
	}
}