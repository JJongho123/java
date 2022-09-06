package ja_0809;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet_1 extends Applet{
	public void paint(Graphics g) {
		for (int i = 0; i < 400; i += 13) {
			g.setColor(new Color((int)Math.random()*250),
					             (int)Math.random()*255),
								 (int)Math.random()*255));
			g.drawOval(10, 10, i, i);
			g.drawOval(400-i, 30, i, i);
			
			
		}
	}

}
