package ja_0803;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_1 extends Frame {

	public TextField_1(String str) {
		super(str);
		setLayout(new FlowLayout());

//		TextField 와 TextArea 
//
//		텍스트 필드는 한줄로 되어있는 입력 컴포넌트이고 텍스트 아레아는 여러줄에
//		걸쳐 입력을 받을수 있는 문자열 입력 컴포넌트입니다.

		Label lbl1 = new Label("아이디 입력 :");
		Label lbl2 = new Label("비밀번호 입력 :");

		TextField txt1 = new TextField("ID", 20);
		TextField txt2 = new TextField("korea", 20);
		// korea 는 txt2 컴포넌트 위에 찍힘
		// 초기 문자열 , 20은 20 개의 문자를 입력가능한 크기지정

		txt2.setEchoChar('*'); // 비밀번호를 입력하면 * 가 찍힌다.

		add(lbl1);
		add(lbl2);
		add(txt1);
		add(txt2);

		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new TextField_1("Txt~~");
	}

}
