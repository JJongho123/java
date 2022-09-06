package ja_0812;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class Java2D_5 extends Frame{
	
	TexturePaint texture;
	BufferedImage bImg;
	Ellipse2D.Double circle;
	
	public Java2D_5(String str) {
		super(str);
		
		Image img = Toolkit.getDefaultToolkit().getImage("src/images/flower_4.jpg");
		MediaTracker mt = new MediaTracker(this);
		
		mt.addImage(img,0);
		
		try {
			mt.waitForAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		bImg = new BufferedImage(img.getWidth(this),
								img.getHeight(this),BufferedImage.TYPE_3BYTE_BGR);
		
		Graphics2D g2 = bImg.createGraphics();
		
		g2.drawImage(img, 0, 0, this);
		
		Rectangle rect = new Rectangle(0,0,img.getWidth(this),img.getHeight(this));
		
		texture = new TexturePaint(bImg,rect);
//		TexturePaint 클래스는 이미지가 윈도우 화면에 바둑판식으로
//		배치되는 형태와 비슷한 역활을 함.
		
		circle = new Ellipse2D.Double(50,50,230,230);
		
		setSize(350,350);
		setVisible(true);
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setPaint(texture);
		g2.fill(circle);
		
		
	}
	public static void main(String[] args) {
		new Java2D_5("Java2D_5");
	}

}









