package ja_0802;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300,200);
		ff.setLayout(null);		//null로 지정하게되면 좌표값을 따로 지정해줘야한다.
		
		Label id = new Label("ID : ");
		id.setBounds(100,100,30,18);
		
//		Label(레이블)
//			:레이블은 문자열을 출력하는 컴포넌트 입니다.
//			보통 화면에서 다른 컴포넌트의 용도를 알리기 위한
//			목적으로 사용됩니다.
		
		Label password = new Label("password : ");
		password.setBounds(100,120,100,18);	//	setBounds  => setLocation() + setSize()와 같다.
		
		Label address = new Label("address : ");
		address.setBounds(100,140,100,18);
		address.setBackground(new Color(125,255,255));
		address.setForeground(new Color(255,0,0));
		
		ff.add(id);
		ff.add(password);
		ff.add(address);
		
		ff.setVisible(true);
		
	}

}














