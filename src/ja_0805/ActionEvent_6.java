package ja_0805;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener {

	Label lid;
	Label lpwd;
	Label ltel;

	TextField tfId;
	TextField tfPwd;
	TextField tfTel;

	Button ok;

	public ActionEvent_6(String str) {
		super(str);
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("PWD : ", Label.RIGHT);
		ltel = new Label("Tel : ",Label.RIGHT);

		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfTel = new TextField(10);
		tfPwd.setEchoChar('*');
		ok = new Button("OK");

		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		tfTel.addActionListener(this);
		ok.addActionListener(this);

		setLayout(new FlowLayout());

		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ltel);
		add(tfTel);
		add(ok);

		setSize(450, 80);
		setVisible(true);
		setLocation(700, 300);
	}

	public static void main(String[] args) {
		new ActionEvent_6("ActionEvent test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String id = tfId.getText();
		String password = tfPwd.getText();
		String tel = tfTel.getText();

		if (!id.equals("korea")) {
			System.out.println("입력하신 ID 가 존재하지 않습니다. 다시입력하세요");
			tfId.requestFocus(); // focus 를 id 로 하라.
			tfId.selectAll(); // 모두 선택해 달라는 메서드.
		}
		else if (!password.equals("seoul")) {
			System.out.println("입력하신 password 가 존재하지않습니다 . 다시입력하세요");
			tfPwd.requestFocus();
			tfPwd.selectAll();
		} 
		else if (!tel.equals("88149545")) {
			System.out.println("입력하신 번호가 존재하지않습니다 . 다시입력하세요");
			tfTel.requestFocus();
			tfTel.selectAll();
		}

		else {
			System.out.println(id + " 님 로그인되었습니다.");
		}

	}

}







