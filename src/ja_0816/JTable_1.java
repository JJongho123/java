package ja_0816;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTable_1 extends JFrame{
	JTable table;
	String[] fieldName = {"<html>font color=red size=5 >학번</font></html>",
						"<html>font color=green size=5 >국어</font></html>",
						"<html>font color=green size=5 >영어</font></html>",
						"<html>font color=green size=5 >수학</font></html>"};
	
	String[][]data = {{"20220801","78","89","68"},
					{"20220802","35","66","93"},
					{"20220803","56","23","88"},
					{"20220804","89","85","67"},
					{"20220805","69","70","94"},
					{"20220806","90","57","54"}};
	
	public JTable_1(String title) {
		super(title);
		
		table = new JTable(data,fieldName);
		JScrollPane spp = new JScrollPane(table);
		
		getContentPane().add(spp,"Center");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTable_1("JTable Test !! ~ !!");
	}
	

}
















