package ja_0809;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_2 extends Frame{
	public WindowEvent_2 (String title) {
		super(title);
		
		addWindowListener(new Handler());
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEvent_2("Window Event Test");
	}
	public class Handler extends WindowAdapter{ //WindowAdapter를 사용하면 이벤트를 한 개 이상을 사용할 수 있게 해준다. (굳이 이벤트를 다 쓰지 않아도 가능하다.)
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0); //프로그램 종료
		}
	}
}
//    addWindowListener(new Handler());
//    
//	public void windowClosing(WindowEvent e) {
//	System.out.println("윈도우 닫기");
//	System.exit(0);} //프로그램 종료   //이 코드만 있다면 모든 프레임을 X를 눌러 닫을 수 있다.