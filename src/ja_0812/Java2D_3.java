package ja_0812;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Java2D_3 extends Frame{
	
	GradientPaint grd;
	Ellipse2D.Double circle;
	
	public Java2D_3(String str) {
		super(str);
		
//		grd = new GradientPaint(100, 100, Color.green,50,50,Color.red,true);	//true 를 줘야 반복된다.
		grd = new GradientPaint(100, 50, Color.black,50,100,Color.red,true);	
		//						시작좌표		시작색	끝좌표		끝색
		//그라데이션 효과는 시작 좌표의 색이 끝좌표의 색으로 서서히 번지는 효과
		circle = new Ellipse2D.Double(50,50,500,500);
		
		setSize(600,600);
		setVisible(true);
		
		
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setPaint(grd);
		g2.fill(circle);
		
	}
	public static void main(String[] args) {
		
		new Java2D_3("Java2D_3");
	}
}










