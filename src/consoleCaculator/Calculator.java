package consoleCaculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JTextField inputSpace;
	private ArrayList<String> equation = new ArrayList<String>();
	private String num = "";

	public Calculator() {
		setLayout(null);

		inputSpace = new JTextField();
		inputSpace.setEditable(false); // 편집기능 막기
		inputSpace.setBackground(new Color(255, 0, 0));
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		inputSpace.setBounds(8, 10, 270, 70);
		add(inputSpace);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
		buttonPanel.setBounds(8, 90, 270, 235);

		String button_name[] = { "C", "÷", "×", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0" };
		JButton button[] = new JButton[button_name.length];

		for (int i = 0; i < button_name.length; i++) {
			button[i] = new JButton(button_name[i]);
			button[i].setFont(new Font("Arial", Font.BOLD, 20));
			if (button_name[i] == "C")
				button[i].setBackground(new Color(255, 0, 0));
			else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14))
				button[i].setBackground(new Color(0, 0, 0));
			else
				button[i].setBackground(Color.gray);
			button[i].setForeground(new Color(255, 255, 255));
			button[i].addActionListener(new PadActionListener());
			buttonPanel.add(button[i]);

		}
		add(inputSpace);
		add(buttonPanel);

		setTitle("계산기");
		setVisible(true);
		setSize(300, 370);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class PadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();

			String operation = e.getActionCommand();// 어떤버튼이눌렷는지 받아주는메서드
			if (operation.equals("C")) {
				inputSpace.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			} else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				// 나머지 버튼이 눌렸을때 계산식 실행하기위한 코드
			}
		}
	}

	private void fullTextParsing(String inputText) {
		equation.clear();

		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);

			if (ch == '-' | ch == '+' | ch == '×' | ch == '÷') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
	}

	public double calculate(String inputText) {
		fullTextParsing(inputText);
		double prev = 0;
		double currnet = 0;
		String mode = "";

		for (String s : equation) {
			if (s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("×")) {
				mode = "mul";
			} else if (s.equals("÷")) {
				mode = "div";
			} else {
				currnet = Double.parseDouble(s);
				if (mode == "add") {
					prev += currnet;
				} else if (mode == "sub") {
					prev -= currnet;
				} else if (mode == "mul") {
					prev *= currnet;
				} else if (mode == "div") {
					prev /= currnet;
				} else {
					prev = currnet;
				}
			}
		}
		return prev;
	}

	public static void main(String[] args) {

		new Calculator();
	}
}