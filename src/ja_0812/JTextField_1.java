package ja_0812;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_1 extends JFrame{
	
	private JButton button;
	private JTextField text , result , text2;
	
	public JTextField_1() {
		setSize(300,130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("숫자 입력 : "));
		text = new JTextField(15);
		
//		text.addActionListener(listener);	//	이벤트를 받아들인 컴포넌트 객체에 리스너 등록
//		text.addActionListener(new ButtonListener);	
		
		panel.add(text);
		
		panel.add(new JLabel("숫자 입력2 : "));
		text2 = new JTextField(15);
		
		text2.addActionListener(listener);	
		
		panel.add(text2);
		
		panel.add(new JLabel("제곱한 값 : "));
		
		result = new JTextField(15);
		result.setEditable(false);
		result.setBackground(new Color(200,200,70));
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
		
		
		
	}
	//내부 클래스로서 텍스트 필드와 버튼의 액션 이벤트 처리
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Object obj = e.getSource();
			
			if(obj == button || obj == text || obj == text2) {
				
				String name = text.getText();	//문자인 숫자를 아래 코드로 다시 숫자화 시킨다.
				int value = Integer.parseInt(name);
				
				String name2 = text2.getText();
				int value2 = Integer.parseInt(name2);
				
				result.setText(" "+ value * value2);
				
				
				text.requestFocus();
				
				
			}
		
		}
		
	}
	public static void main(String[] args) {
		new JTextField_1();
	}

}













