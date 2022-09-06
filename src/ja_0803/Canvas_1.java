package ja_0803;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class Canvas_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest");
		ff.setSize(300,300);
		ff.setLayout(null);
		
		Canvas cc = new Canvas();		//그림을 그리거나 글씨를 쓰는 컴포넌트
		
		cc.setBackground(new Color(125,255,255));
		cc.setBounds(100,100,150,100);
		
		Canvas cc2 = new Canvas();
		
		cc2.setBackground(new Color(125,0,125));
		cc2.setBounds(100,250,250,300);
		
		
		ff.add(cc);
		ff.add(cc2);
		ff.setVisible(true);
		
		
		
	}

}
