package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_3 extends Frame{
	
	Frame[] win = new Frame[7];
	String[] str = {"빨강", "주황", "파랑", "노랑", "초록", "핑크", "검정"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.green, Color.yellow, Color.pink, Color.black};
	
	public WindowEvent_3(String title) {
		super(title);
		int i;
		
		for (i = 0; i < 7; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i * 80, i * 80); // X값, Y값
			win[i].setSize(100, 100);
			win[i].addWindowListener(new WindowHandler()); 
			win[i].setVisible(true);
		}
	}
		class WindowHandler extends WindowAdapter{ //WindowAdapter를 사용해 필요한 이벤트만 생성 가능.
			public void windowClosing(WindowEvent e){ //X를 누른 창만 닫는다, 7개중 하나만 닫으면 그거 하나만 닫힘.
				String msg = "";
				Window obj = (Window) e.getSource();
			
				for (int i = 0; i < 7; i++) {
					if(obj == win[i]) {
						msg = str[i];
						win[i].dispose();
				}
			}
			System.out.println("닫힌 윈도우 색 : " + msg);
		}
		public void windowIconified(WindowEvent e) {
			System.out.println("윈도우 닫기 닫기");
			System.exit(0); //프로그램 전부 닫기. 근데 X가 아니라 창을 내리는 - 를 눌러야 닫힘
		}
	}
	public static void main(String[] args) {
		new WindowEvent_3("Window Event Test");
	}
}