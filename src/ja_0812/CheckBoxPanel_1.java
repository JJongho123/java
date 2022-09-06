package ja_0812;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxPanel_1 extends JPanel implements ItemListener{
	
	JCheckBox[] buttons = new JCheckBox[4];
	String[] fruits = {"apple","grape","orange","watermellon"};
	JLabel[] pictureLabel = new JLabel[4];
	ImageIcon[] icon = new ImageIcon[4];
	
	public CheckBoxPanel_1() {
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
				if(e.getStateChange() == ItemEvent.DESELECTED)
					pictureLabel[i].setIcon(null);
				else
					pictureLabel[i].setIcon(icon[i]);
					
			}
		}
				
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CheckBoxPanel_1 panel = new CheckBoxPanel_1();
		
		panel.setOpaque(true);
		
		frame.add(panel);
		frame.setSize(700,400);
		frame.setVisible(true);
	}

}

