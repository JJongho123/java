package ja_0812;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox_1 extends JFrame implements ActionListener{

	JLabel label;
	ImageIcon icon;
	
	public ComboBox_1() {
		setTitle("콤보 박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,270);
		
		String[] flowers  = {"flo_1","flo_2","flo_3","flo_5"};
		JComboBox animalList = new JComboBox(flowers);
		animalList.setSelectedIndex(1);
		animalList.addActionListener(this);
		
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		changePicture(flowers[animalList.getSelectedIndex()]);
		add(animalList,BorderLayout.SOUTH);
		add(label,BorderLayout.CENTER);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String name = (String)cb.getSelectedItem();
		
		changePicture(name);
	}
	protected void changePicture(String name) {
		icon = new ImageIcon("src/images/"+name+".jpg");
		
		if(icon != null) {
			label.setIcon(icon);
		}
		else {
			label.setText("이미지가 발견되지 않았습니다.");
		}
		
	}
	public static void main(String[] args) {
		new ComboBox_1();
	}
	

}








