package ja_0803;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame{
	
	public Menu_2(String str) {
		super(str);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		Menu dd = new Menu("도구");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새화일",true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		
		MenuItem file_separator = new MenuItem("-");		// 바(-) 표시만 가능하다
		MenuItem file_close = new MenuItem("파일닫기");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		file.add(edit);
		
		
		
		CheckboxMenuItem dd_new = new CheckboxMenuItem("기본설정",true);
		CheckboxMenuItem dd_open = new CheckboxMenuItem("정렬");
		
		
		
		dd.add(dd_new);
		dd.add(dd_open);
		
		Menu dd1 = new Menu("기록");
		MenuItem dd_cut = new MenuItem("utf8");
		MenuItem dd_paste = new MenuItem("Euc-k");
		
	
		
		dd1.add(dd_cut);
		dd1.add(dd_paste);
		
		dd.add(dd1);
		
		mb.add(file);
		mb.add(dd);
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Menu_2("메뉴222");
	}

}
