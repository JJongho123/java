package ja_0803;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_1 extends Frame{
	
	public Menu_1(String str){
		super(str);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		
		MenuItem file_new = new MenuItem("새화일");
		MenuItem file_open = new MenuItem("불러오기");
		MenuItem file_close = new MenuItem("파일닫기");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu find = new Menu("검색");
		
		MenuItem find_ff = new MenuItem("찾기");
		MenuItem find_change = new MenuItem("바꾸기");
		
		
		
		
		
		find.add(find_ff);
		find.add(find_change);
		
		
		mb.add(file);
		mb.add(edit);
		mb.add(find);
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new Menu_1("Menu 만들기~~");
		
	}

}
