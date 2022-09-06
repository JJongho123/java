package ja_0808;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4 extends Frame implements ItemListener{

	Choice lst_1,lst_2;
	Label lbl_info;
	
	String[] 대륙 = {"아시아","유럽","아프리카"};
	String[][] 나라 = {{"한국","일본","중국"},
					{"영국","스위스","프랑스"},
					{"이집트","콩고","우간다"}};
	
	public ItemEvent_4(String str) {
		super(str);
		Label lbl = new Label("대륙과 나라를 선택하세요>");
		Panel panel = new Panel();
		

		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for(int i =0;i<대륙.length;i++) 
			lst_1.add(대륙[i]);
		lst_2.add("             ");		//처음시작했을때 공백처리하겠다.
		
		panel.add(lst_1);
		panel.add(lst_2);
		
		add("North",lbl);
		add("Center",panel);
		add("South",lbl_info);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e) {		//list 에서 클릭되면 이벤트처리됨
		Object obj = e.getSource();
		String str = "선탁한 대륙과 나라는";
		
		if(obj == lst_1) {
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();		//자동적으로 인덱스 부여되어있는것을 받아온다
			for(int i=0;i<나라[j].length;i++) {
				lst_2.add(나라[j][i]);
			}
			
		}else {
			str += lst_1.getSelectedItem();
			str +="-" + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
		
	}
	public static void main(String[] args) {
		new ItemEvent_4("ItemEvent_4 예제");
	}
			
		
	

}






























