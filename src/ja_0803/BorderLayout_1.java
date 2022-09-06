package ja_0803;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{
	
	
	
//	BorderLayout 
//	보더레이아웃은 East ,West , South , North , Center 로 화면을 분할합니다.
//	중앙에는 중요한 컴포넌트를 두고 , 그주변에 보조 컴포넌트를 배치할 때 사용합니다.
//	Frame 컨테이너의 기본 레이아웃입니다.
	
	BorderLayout bb1 = new BorderLayout();	//생략해도 보더 레이아웃이다 Frame 은 기본이 보더 레이아웃을 가지고있기때문이다.
	
	public BorderLayout_1(String str) {
		
		super(str);
		setLayout(bb1);
		
		add("North",new Button("북쪽")).setBackground(new Color(125,255,255));
		add("South",new Button("남쪽")).setBackground(new Color(125,0,255));
		add("East",new Button("동쪽")).setBackground(new Color(125,0,125));
		add("West",new Button("서쪽")).setBackground(new Color(255,55,55));
		add("Center",new Button("중앙")).setBackground(new Color(75,75,0));
		
		setSize(300,300);
		
		setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new BorderLayout_1("보더레이아웃 테스트~~");
	}
	

}
