package ja_0803;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextField_3 {
	
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(400,80);
		ff.setLayout(new FlowLayout());
		
		Label lid = new Label("ID :",Label.RIGHT);
		Label lpwd = new Label("password :",Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		
		pwd.setEchoChar('*');
		
		lid.setBackground(new Color(125,255,255));
		lpwd.setBackground(new Color(0,125,125));
		id.setBackground(new Color(255,125,255));
		id.setFont(new Font("궁서체",Font.BOLD|Font.BOLD,17));
		
		ff.add(lid);
		ff.add(id);
		ff.add(lpwd);
		ff.add(pwd);
		
		ff.setVisible(true);
		
		
		
	}
	
}
