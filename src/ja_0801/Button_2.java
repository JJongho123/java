package ja_0801;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_2 extends Frame {
	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;

	public Button_2(String str) {
		super(str);
		setLayout(new FlowLayout());		//FlowLayout = >  좌우로 배치하다가 공간이없으면 내려간다
		lbl1 = new Label("가위");
		lbl2 = new Label("바 위");
		lbl3 = new Label("보");

		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");

		add(lbl1);
		add(btn1);
		add(lbl2);
		add(btn2);
		add(lbl3);
		add(btn3);

		lbl1.setEnabled(false);
		btn3.setEnabled(false);

		btn2.setBackground(new Color(255, 0, 0));	//뒷배경 색상지정
		btn2.setForeground(new Color(0, 255, 0));	//글씨 색상지정

		setSize(300, 200);		//크기 지정
		setLocation(300, 300);	//창띄우는곳 지정
		setVisible(true);		

	}

	public static void main(String[] args) {
		new Button_2("버튼과 레이블");
	}

}

//버튼(Button)
//:버튼은 가장많이 사용되는 GUI 컴포넌트이고 , 주로 사용자의
//입력을 받을때 사용합니다. 사용자가 어떤 결정을 내릴때
//사용하는 컴포넌트 입니다.
//
//	생성자
//	
//public Button()					: 기본생성자
//public Button(String label)		: 문자열이 지정된 생성자
//
//	중요 메서드
//	
//public String getLabel()						:	버튼위에 있는 문자열 반환
//public void  setLabel(String label)				:	버튼위의 문자열 지정
//public void addActionListenet(ActionListener al) 	: 버튼에서 발생한 ActionEvent 를 처리할수 있도록 등록
//
//public String getActionCommand()	:	버튼에서 이벤트가 발생하면 Command(명령) 이름을 받아옵니다.
//public void setActionCommand(String cmd) :	 버튼에 Command 이름을 설정
