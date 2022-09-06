package ja_0812;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Tab_1 extends JFrame implements ChangeListener{
	
	JTabbedPane pane;
	JLabel lbl_info;
	
	public Tab_1(String str) {
		super(str);
		
		JPanel one , two , three , four;
		
		pane = new JTabbedPane();
		lbl_info = new JLabel("                  ");
		
		one = new JPanel();
		one.add(new JLabel("첫번째 텝~~~"));
		one.add(new JTextField("문자 입력"));
		one.setBackground(Color.green);
		
		pane.addTab("<html><font color=red>One</font></html>",one);
		
		two = new JPanel();
		two.add(new JLabel("두번째 텝 ^^^^^"));
		two.setBackground(Color.red);
		
		pane.addTab("<html><font color=blue>Two</font></html>",two);
		
		three = new JPanel();
		three.add(new JLabel("세번째 텝~!@$!@#$~~"));
		three.setBackground(Color.yellow);
		
		pane.addTab("<html><font color=#33dd66>Three</font></html>",three);
		
		four = new JPanel();
		four.add(new JLabel("네네네네네번째 텝~!@$!@#$~~"));
		four.setBackground(Color.blue);
		
		pane.addTab("<html><font color=orange>Four</font></html>",four);
		
		pane.setSelectedIndex(1);
		pane.addChangeListener(this);
		
		getContentPane().add("North",new JLabel("Tab 사용 예제~~"));
		getContentPane().add("Center",pane);
		getContentPane().add("South",lbl_info);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	}
	public void stateChanged(ChangeEvent e) {
		int index = pane.getSelectedIndex();
		String msg = "<html><font size=7 color=black>"+pane.getTitleAt(index)+"</font></html>";
		
		lbl_info.setText(msg);
		pane.setSelectedIndex(index);
		
		
		
	}
	public static void main(String[] args) {
		new Tab_1("Tab test~~~");
	}
	
}
	
	
	
	
	
	
	
	

