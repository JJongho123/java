package ja_0816;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ToolTip_1 extends JFrame{
	
	public ToolTip_1(String str) {
		super(str);
		
		JButton btn = new JButton("나 버튼 ~~");
		JLabel lbl = new JLabel("ToolTab test @@ ");
		JTextArea txt = new JTextArea(" ==^^== ");
		
		btn.setToolTipText("<html><font size=7 color=rgb(255,0,6)>"
						+ " 툴팁툴팁 ^^^^</font></html>");
		lbl.setToolTipText("나는 자바 초보가 아닙니다.@@@ ");
		txt.setToolTipText("툴팁 정말 좋은 기능입니다 . ");
		
		getContentPane().add("North",lbl);
		getContentPane().add("Center",txt);
		getContentPane().add(btn,"South");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
	new ToolTip_1("ToolTip_1~~");
	}

}













