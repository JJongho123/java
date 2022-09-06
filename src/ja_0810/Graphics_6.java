package ja_0810;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_6 extends Frame implements MouseMotionListener{

	int x = 0;
	int y = 0;
	
	public Graphics_6(String str) {
		super(str);
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setBounds(100,100,500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Graphics_6("Graphics_6 test");
	}
	public void paint(Graphics g) {
		g.drawString("마우스를 움직이세요!!", 20, 50);
		g.drawString("**", x, y);
	}
	public void update(Graphics g) {
		paint(g);
	}
	
	
	
	public void mouseDragged(MouseEvent me) {
		
	}

	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		repaint();
	}
	
	
	

}
