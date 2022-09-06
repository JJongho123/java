package ja_0809;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_2 extends Frame{
	public static void main(String[] args) {
		new Graphics_2("Graphics Test");
	}
	
	public void paint(Graphics g) {
		
		g.setFont(new Font("Serif", Font.PLAIN, 17));
		g.drawString("Graphics를 이용해 그림을 그립니다.", 10, 50);

		g.drawOval(50, 100, 50, 50);

		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);

		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);

		g.fillRoundRect(200, 100, 120, 80, 30, 30); //200(x) 100(y)의 위치에서 120, 80 크기의 사각형을 만든다. 30, 30은 크기가 클 수록 원에 가까워진다.

		g.setColor(Color.orange);
		g.fillPolygon(new int[] {50, 100, 150, 200, 150, 100},   // x축 좌표
		              new int[] {250, 200,200,250,300,300,}, 6); // y축 좌표 마지막 6은 6각형의 6

		g.setColor(new Color(159,255,210));
		g.fillPolygon(new int[] {110, 50, 30, 80, 130},
		              new int[] {200, 200, 90, 50, 90,}, 5);

		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 120);
		
		g.setColor(Color.magenta);
		g.fillArc(200, 200, 100, 150, 320, -280);
	}
	
	public Graphics_2(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setBounds(700, 100, 400, 400);
		setVisible(true);
	}
}