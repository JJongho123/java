package ja_0809;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest {
	public static void main(String[] args) {
		
		MyFrame ff = new MyFrame("My Speed");
		
		Graphics gg = ff.getGraphics();
		gg.setColor(new Color(155,155,220));
		
		for (int i = 0; true; i += ff.speed) { //i 속도만큼 속도가 올라간다. //조건식이 true면 무한루프
			try {
				Thread.sleep(100); // 1/10 초
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			gg.clearRect(0, 0, 350, 400); //화면을 지우고 쓰는 메서드, 잔상을 없애주는 메서드
			gg.drawString("김근종", 150, i); //좌우, 상하 방향을 바꾸려면 drawString() 메서드에서 값을 변경.
			                   //  x , y
			i = (i < 350) ? i : 0; //350보다 작다면 i 값을 계속 쓰고, 350이 넘으면 다시 0으로 간다.
		}
	}
}
	class MyFrame extends Frame {
		int speed = 1; 
		Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 15, 0, 95); //95에서 15를 뺀 0~80까지의 속도
		
		Label lSpeed = new Label("Speed : 1");
		
		public MyFrame(String title) {
			super(title);
			
			lSpeed.setBackground(new Color(0,255,0));
			lSpeed.setSize(70, 20);
			lSpeed.setLocation(20, 40);
			
			sbb.setSize(300, 20);
			sbb.setLocation(20, 250);
			
			add(sbb);
			add(lSpeed);
			
			sbb.addAdjustmentListener(new MyHandler());
			
			addWindowListener(new MyHandler());
			
			setSize(350, 350);
			setLayout(null); //Layout() 값이 null이여야 setLocation() 좌표 값을 설정 가능하다.
			setVisible(true);
			setResizable(false); //사이즈를 바꾸지 않게 하는 메서드에 false 값을 넣어준다.
		}
		class MyHandler extends WindowAdapter implements AdjustmentListener{
			public void adjustmentValueChanged(AdjustmentEvent e) {
				speed = sbb.getValue(); //스크롤바의 getValue()를 speed에 담는다.
				lSpeed.setText("Speed : " + speed); 
			}
			public void windowClosing(WindowEvent we) { //WindowAdapter의 6개의 메서드중 하나
				System.exit(0); //출력창의 X를 누르면 창을 끌 수 있다.
		}
	}
}