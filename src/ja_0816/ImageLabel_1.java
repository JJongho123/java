package ja_0816;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabel_1 extends JFrame implements ActionListener{

	private JPanel panel1 , panel2 , panel3;
	private JLabel label1 , label2;
	private JButton button1, button2 ,button3;
	
	public ImageLabel_1() {
		setTitle("이미지 레이블");
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		label1 = new JLabel("이미지를 보려면 아래버튼을 누르세요");
		
		button1 = new JButton("이미지 레이블 11");
		
		ImageIcon icon = new ImageIcon("src/images/bttrfly1.jpg");
		button1.setIcon(icon);
		
		button2 = new JButton("이미지 레이블 22");
		ImageIcon icon2 = new ImageIcon("src/images/bttrfly4.jpg");
		button2.setIcon(icon2);
		
		button3 = new JButton("이미지 레이블 3332");
		ImageIcon icon3 = new ImageIcon("src/images/bttrfly3.jpg");
		button3.setIcon(icon3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		
		panel3.setLayout(new GridLayout(2,1));
		panel3.add(panel1);
		panel3.add(panel2);
		
		add(panel3);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		ImageLabel_1 t = new ImageLabel_1();
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		
		if(obj == button1) {
			
			ImageIcon apple = new ImageIcon("src/images/apple.gif");
			
			label1.setIcon(apple);
			label1.setText(null);
		}
		else if(obj == button2){
			ImageIcon grape = new ImageIcon("src/images/grape.gif");
			
			label1.setIcon(grape);
			label1.setText(null);
		}
		else {
			ImageIcon watermellon = new ImageIcon("src/images/watermellon.gif");
			
			label1.setIcon(watermellon);
			label1.setText(null);
		}
			
	}

}







