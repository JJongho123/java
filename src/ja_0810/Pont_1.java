package ja_0810;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class Pont_1 {
	public static void main(String[] args) {
		
		XCanvas canvas = new XCanvas();	//그림을 그리기 위한 도구
		
		Frame ff = new Frame("font test");
		ff.add(canvas);
		
		ff.setSize(400,300);
		ff.setVisible(true);
		
		
		
	}

}
class XCanvas extends Canvas{
	Font font = null;
	
	public void paint(Graphics g) {	// g 는 붓이다
		font = new Font("Timesroman",Font.BOLD,23);
		g.setFont(font);
		g.drawString("비오는 수요일~~",50,50);
		
		font = new Font("궁서",Font.BOLD|Font.ITALIC,17);
		g.setFont(font);
		g.setColor(Color.green);
		g.drawString("시원한 강바람~", 50, 120);
		
		font = new Font("궁서체",Font.BOLD|Font.HANGING_BASELINE,30);
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("돌아오는 휴일을 그리면서 ###", 50, 200);
		
		
	}
	
}








