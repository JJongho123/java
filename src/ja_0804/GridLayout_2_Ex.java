package ja_0804;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2_Ex extends Frame {
	
	public GridLayout_2_Ex(String str) {
		super(str);
		
		setLayout(new GridLayout(3,2));
		Choice cc = new Choice();
		List list = new List(4);
		
		list.add("도봉산");
		list.add("산산산");
		list.add("북한산");
		list.add("백두산");
		
		cc.add("꽃");
		cc.add("국화꽃");
		cc.add("해바라기");
		cc.add("무궁화");
		
		
		
		
		
		
		add(new Button("Button1"));
		add(list);
		add(cc);
		add(new TextArea("아름다운 사람",5,15));
		add(new TextField("TextField"));
		add(new Panel());
		
		setSize(200,200);
		setVisible(true);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new GridLayout_2_Ex("GridLayout Test22");
	}

}
