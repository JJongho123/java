package ja_0810;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_8 extends Frame implements MouseMotionListener{

	int x = 0;
	int y = 0;
	
	Image img = null;
	Graphics gImg = null;
	
	public Graphics_8(String str) {
		super(str);
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
		setBounds(100,100,500,500);
		setVisible(true);
		
		img = createImage(500,500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른채로 마우스 움직임", 15, 50);
		repaint();
	}
	public void paint(Graphics g) {
		if(img == null)
		g.drawImage(img, 1, 1, this);	//가상 화면에 그려진 그림을 Frame 에 복사
	}
	public void update(Graphics g) {
		paint(g);
	}
	
	public static void main(String[] args) {
		new Graphics_8("Graphics_8");
	}
	
	
	public void mouseDragged(MouseEvent me) {
		if(me.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK)
			return;
		gImg.drawLine(x, y, me.getX(), me.getY());
		x = me.getX();
		y = me.getY();
		repaint();
		
	}

	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		gImg.clearRect(x, y, 30, 30);
		repaint();
	}
	

}
