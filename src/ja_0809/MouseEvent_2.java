package ja_0809;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEvent_2 extends Frame implements MouseMotionListener{ //MouseMotionListener 두개의 이벤트 메서드가 생성됨.

	Label info;

	public MouseEvent_2(String title) {
		super(title);
		info = new Label();

		add("North", info);
		addMouseMotionListener(this);

		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEvent_2("Mouse Event Test");
	}
	public void mouseDragged(MouseEvent e) { //
		info.setText(" X = " + e.getX() + //getX() 프레임 상의 좌표
				     ", XX = " + e.getXOnScreen() + //getXOnScreen() 모니터 상의 좌표 값
				     ", Y = " + e.getY() + 
				     ", YY = " + e.getYOnScreen());
	}
	public void mouseMoved(MouseEvent e) { //
		System.out.println("마우스 드레그");
	}
}