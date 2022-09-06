package ja_0816;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyCarTest_1 extends JFrame{
	
	public MyCarTest_1() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyCarTest_1 s = new MyCarTest_1();
		
	}
	

}
class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x = 100,img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("src/images/car_10.jpg"));
		}catch(Exception e) {
			System.out.println("no image");
			System.exit(1);							//이미지가 없다면 창을 띄우지않고 에러 메세지를 띄운다.
			}
		addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
				case KeyEvent.VK_UP:
				img_y -=10;
				break;
				case KeyEvent.VK_DOWN:
				img_y +=10;
				break;
				case KeyEvent.VK_LEFT:
				img_x -=10;
				break;
				case KeyEvent.VK_RIGHT:
				img_x +=10;
				break;
				
				}
				repaint();
			}

			public void keyTyped(KeyEvent e) {
				
			}

			public void keyReleased(KeyEvent e) {
				
			}
			
		});
		this.requestFocus();
		setFocusable(true);
		}
	public void paintComponent(Graphics g) {	//스윙 컴포넌트가 자신의 모양을 그리는 메소드
												//컴포넌트가 그려져야 하는 시점마다 호출
												//크기가 변경되거나 , 위치가 변경되거나 , 컴포넌트가 가려졌던것이 사라지는 등
		super.paintComponent(g);
		g.drawImage(img,img_x,img_y,null);
	}
	
}





















