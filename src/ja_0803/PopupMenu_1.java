package ja_0803;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{
	
	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String str) {
		super(str);
		
		popup = new PopupMenu("나의 팝업 메뉴");
		txt = new TextArea("korea");
		
		MenuItem cut = new MenuItem("오려두기");
		MenuItem paste = new MenuItem("붙이기");
		MenuItem copy = new MenuItem("복사하기");
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		txt.addMouseListener(this);
		txt.add(popup);
		
		add(txt);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PopupMenu_1("popup menu Test");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
		popup.show(txt,e.getX(),e.getY());
		System.out.println(" "+txt+" : "+e.getX()+", \n"+e.getY());
	
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	

}
