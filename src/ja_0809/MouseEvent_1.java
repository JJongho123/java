package ja_0809;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_1 extends Frame implements MouseListener{ //MouseListener에는 5개의 이벤트가 오버라이딩 된다.
	public MouseEvent_1(String title) {
		super(title);
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEvent_1("Mouse Event Test");
	}
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭클릭클릭클릭클릭클릭클릭");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 누름누름누름누름누름");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 놔 놔 놔 놔 놔 놔 놔");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 들어옴 들어옴 들어옴 들어옴");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 벗어남 벗어남 벗어남");
	}
}