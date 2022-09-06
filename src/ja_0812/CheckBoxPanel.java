package ja_0812;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel implements ItemListener{
	
	JCheckBox[] buttons = new JCheckBox[4];
	String[] fruits = {"apple","grape","orange","watermellon"};
	JLabel[] pictureLabel = new JLabel[4];
	ImageIcon[] icon = new ImageIcon[4];
	
	public CheckBoxPanel() {
		super(new GridLayout(0,5));
		
		for(int i=0;i<4;i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i]+".gif");
			icon[i] = new ImageIcon("src/images/"+fruits[i]+".gif");
		}
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for(int i=0;i<4;i++) {
			checkPanel.add(buttons[i]);
		}
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
		add(pictureLabel[3]);
			
			
		}
	

	
	
	
	

	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		
		Object source = e.getItemSelectable();
		for(int i=0;i<4;i++) {
			if(source == buttons[i]) {
				if(e.getStateChange() == ItemEvent.DESELECTED)		//선택되어 있다면 아이콘을 null로 하고
					pictureLabel[i].setIcon(null);
				else												// 그렇지 않다면 아이콘을 보여라
					pictureLabel[i].setIcon(icon[i]);
					
			}
		}
				
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxPanel panel = new CheckBoxPanel();
		
		panel.setOpaque(true);
//				기본적인 배경색이 투명이기 떄문에 setOpaque
//				함수를 true 로 지정해줘야 배경색 설정이가능하다.
		
//		java Swing 객체중에 하나인 JLabel의 경우 배경색을 설정하면 효과가 적용되지 않는다
//		이는 JLabel의 배경색이 기본적으로 투명이기 때문이다.
//		
//		jlabel.setOpaque(true);	//	Opaque 값을 true 로 미리 성정해 주어야 배경색이 적용된다.
//		jlabel.setBackground(Color.pint);
//		위와 같이 배경색 설정 이전에 Opaque 값을 true로 설정해 주어야 한다.
		
		frame.add(panel);
		frame.setSize(700,400);
		frame.setVisible(true);
	}

}










