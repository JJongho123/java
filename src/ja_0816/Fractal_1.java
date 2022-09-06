package ja_0816;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Fractal_1 extends Frame{
	public Fractal_1() {
	setSize(800,700);
	
	setVisible(true);
	
	
	}
//	고사리의 잎 윤관이나 나무 가지를 뻗는 양상,
//	리아스식 해안선의 모양 등 많은 것들이 자기 유사성을 가지고 있다.
//	심지어 주식의 변동 곡선도 하루동안의 변화, 한주사이의 변환
//	한달 , 1년 사이의 변화가 비슷한 형태로 나타나는 자기 유사성을 띠고있다.
//	이러한 프렉탈의 자기 복제적인 특징들은 아주 간단한 법칙도 되먹임하면
//	복잡한 양상을 이끌어 낼수 있을을 보여주고있다.
	
	int all = 0;
	
	private void drawTree(Graphics g, int x1, int y1 , double angel , int depth) {
		if(depth == 0)
			return;
		
		int  xx1 = (int)(Math.random() * 25 +1);
		int  yy1 = (int)(Math.random() * 25 +1);
		
		int x2 = x1+(int)(Math.cos(Math.toRadians(angel)) * depth * xx1);
		int y2 = y1+(int)(Math.sin(Math.toRadians(angel)) * depth * yy1);
		g.drawLine(x1, y1, x2, y2);
		
		drawTree(g,x2,y2,angel - 20 , depth -1);
		drawTree(g,x2,y2,angel + 20 , depth -1);
		drawTree(g,x2,y2,angel + 20 , depth -1);
		
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		drawTree(g,500,600,-90,10);
		
		
		
	}
	public static void main(String[] args) {
		new Fractal_1();
	}
}






