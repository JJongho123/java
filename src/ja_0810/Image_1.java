package ja_0810;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Image_1 extends Frame{

	Image img;
//	String ss = "src/images/images.jpg";		//아래와 같은 코드
	String ss = "src\\images\\images.jpg";
	
	public Image_1(String str) {
		super(str);
		
		img = Toolkit.getDefaultToolkit().getImage(ss);	//이미지를 가져오는 방법
		
		
		addWindowListener(new Handler());
		setSize(450,500);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, this);	//드로우로 바로 붙여준다.
	}
	class Handler extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new Image_1("이미지 테스트");
	}
}
