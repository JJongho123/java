package ja_0802;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_5 {public static void main(String[] args) {
	
	Frame ff = new Frame("111 배열 ");
	Frame ff2 = new Frame("222 배열");
	Frame ff3 = new Frame("333 배열");
	Frame ff4 = new Frame("444 배열");
	
	ff.setSize(400,300);
	ff2.setSize(400,300);
	ff3.setSize(400,300);
	ff4.setSize(400,300);
	
	ff.setBackground(new Color(0,255,0));
	ff2.setBackground(new Color(255,255,0));
	ff3.setBackground(new Color(255,255,0));
	ff4.setBackground(new Color(255,255,0));
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	//구현된 Toolkit 객체를 얻는다
	
	Dimension screenSize = tk.getScreenSize();
	//화면 크기를 구한다
	
	ff4.setLocation(screenSize.width/4-200,screenSize.height/4-150);
//	ff3.setLocation(screenSize.width/4*4-200,screenSize.height/4*4-150);
	ff2.setLocation(screenSize.width/4*2,screenSize.height/4*2-150);
	ff.setLocation(screenSize.width/4*3-200,screenSize.height/4*3-150);
	
	ff.setVisible(true);
	ff2.setVisible(true);
//	ff3.setVisible(true);
	ff4.setVisible(true);
	//화면크기의 절반값에서 Frame 크기의 절반값을 뺀 위치로 하면
	//Frame 이 화면 가운데 위치하게 된다.
	
	
}
}
