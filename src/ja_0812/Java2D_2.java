package ja_0812;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Java2D_2 extends Frame{
	
	Rectangle2D.Double rect;
	Ellipse2D.Double circle;
	Line2D.Double line;
	
	float[] pattern = { 30,50,10,25,10,77};
	
	public Java2D_2(String str) {
		super(str);
		
		rect = new Rectangle2D.Double(20,50,250,200);
		circle = new Ellipse2D.Double(50,50,200,200);
		line = new Line2D.Double(30.1,51.3,230.9,289.1);
		
		setSize(350,350);
		setVisible(true);
		
		
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setStroke(new BasicStroke(7));
		g2.setColor(Color.blue);
		g2.draw(rect);
		
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.red);
		g2.draw(circle);
		
		g2.setStroke(new BasicStroke(3,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10,pattern,0));
		
		//	width(선의 두께) , cap (끝점의 모양) , join (꼭지점의 모양) ,
		//	miterlimit(꼭지점 길이의 한계 : 1이상 값) ,
		//	dash(점선의 패턴 길이 모양) ,
		// 	dash_phase(점선간의 공백 거리)가 설정된 스트로크 객체를 만든다.
		
		g2.setColor(Color.black);
		g2.draw(line);
	}
	public static void main(String[] args) {
		new Java2D_2("Java2D_2");
	}
	

}









