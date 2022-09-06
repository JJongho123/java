package ja_0803;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout_1 extends Frame{
	
	Button[] btn = new Button[12];
	
	public GridLayout_1(String str) {
		super(str);
		
		setLayout(new GridLayout(4,3));
		
		for(int i=0;i<12;i++) {
			btn[i] = new Button(i+1+" Button ");
			add(btn[i]);
		}
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayout_1("GridLayout Test~~~");
	}

}
