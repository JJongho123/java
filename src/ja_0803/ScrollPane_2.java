package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_2{
	public static void main(String[] args) {
		
	
	Frame ff = new Frame("ScrollPane");
	
	ff.setSize(300,200);
	
	ScrollPane spp = new ScrollPane();
	Panel pp = new Panel();
	
	pp.setBackground(new Color(255,255,125));
	pp.add(new Button("첫번째"));
	pp.add(new Button("두번째"));
	pp.add(new Button("세번째"));
	pp.add(new Button("네번째"));
	pp.add(new TextArea(15,30)).setBackground(new Color(25,255,255));
	
	
	spp.add(pp);
	ff.add(spp);
	ff.setVisible(true);
	
	}
}













