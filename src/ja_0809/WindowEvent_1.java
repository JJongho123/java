package ja_0809;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_1 extends Frame implements WindowListener{  //WindowListener 가장 많은 이벤트를 가지고 있다.
	public WindowEvent_1(String title) {
		super(title);
		
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEvent_1("Window Event Test");
	}
	public void windowOpened(WindowEvent e) { // 실행순서 2
		System.out.println("윈도우 열기");
	}
	public void windowClosing(WindowEvent e) { // 프레임이 여러개 열렸을 때 하나만 닫는다의 개념 (크롬에서 구글 네이버창 중 하나만 닫는 개념)
		System.out.println("윈도우 닫기");
		this.dispose(); //프로그램 종료
	}
	public void windowClosed(WindowEvent e) { // 아예 모든 프레임이 다 닫힌다는 개념. (크롬에서 구글 네이버 등이 켜져 있지만 크롬 자체를 꺼버리는 개념)
		System.out.println("윈도우 완전 닫기");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("윈도우 아이콘 화");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈도우 아이콘 화 해제");
	}
	public void windowActivated(WindowEvent e) { // 실행순서 1
		System.out.println("윈도우 활성화");
	}
	public void windowDeactivated(WindowEvent e) { 
		System.out.println("윈도우 비활성화");
	}
}