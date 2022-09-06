package ja_0809;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ja_0809.WindowEvent_2.Handler;

public class Key_1 extends Frame implements KeyListener{ //KeyListener 세개의 이벤트 메서드 오버라이딩
	
	TextArea txt_info;
	TextField txt;
	
	public Key_1 (String title) {
		super(title);
		
		addWindowListener(new Handler());
		
		txt = new TextField();
		txt.addKeyListener(this);
		
		add("Center", txt_info = new TextArea());
		add("South", txt);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Key_1("Key Event Test");
	}
	public void keyTyped(KeyEvent e) { //실행 순서 2
		txt_info.append(e.getKeyChar() + " 가 입력되었습니다. \n"); 
	}
	public void keyPressed(KeyEvent e) { //실행 순서 1
		txt_info.append(e.getKeyChar() + " 가 눌렸습니다. \n"); 
	}
	public void keyReleased(KeyEvent e) { //실행 순서 3
		txt_info.append(e.getKeyChar() + " 를 놓았습니다. \n"); 
	}
	class Handler extends WindowAdapter{ //WindowAdapter를 사용하면 이벤트를 한 개 이상을 사용할 수 있게 해준다. (굳이 이벤트를 다 쓰지 않아도 가능하다.)
		public void windowClosing(WindowEvent e) {
			System.out.println("윈도우 닫기");
			System.exit(0); //프로그램 종료
		}
	}
}