package ja_0803;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{
	
	public ScrollPane_1(String str) {
		super(str);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220,200);
		
		
//			ScrollPane 
//			스크롤펜은 하나의 자식 컴포넌트만을 가질수 있습니다.
//			따라서 스크롤팬의 여러개의 컴포넌트를 포함시키기 위해서는
//			패널을 스크롤팬에 붙이고 , 패널위에 컴포넌트를 붙이는 것이 좋습니다.
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("텍스트 에어리어");
		txt.setBackground(new Color(125,225,225));
		txt.setForeground(new Color(255,0,125));
		
		Panel panel2 = new Panel();
		panel2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("텍스트 에어리어22222");
		txt2.setBackground(new Color(125,0,255));
		txt2.setForeground(new Color(12,255,125));
		
		panel.add("North",new Button("버튼"));
		panel.add("Center",txt);
		panel.add("South",new Button("확인"));
		
		panel2.add("North",new Button("버튼"));
		panel2.add("Center",new TextArea("3번째 방법")).setBackground(new Color(255,0,125));
		panel2.add("South",new Button("확인"));
		panel2.add("East",txt2);
		
		
		
		srp.add(panel);	// 스크롤팬에 add한후 밑에서 Frame에 다시 add 해준다.
		
		add("Center",srp);
		
		setSize(200,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ScrollPane_1("스크롤팬~~");
	}

}











