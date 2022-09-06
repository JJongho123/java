package ja_0808;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_5 extends Frame {

	Checkbox[] os = new Checkbox[5];
	Checkbox[] cpu = new Checkbox[3];

	CheckboxGroup cbg;

	Label lbl_info;

	String[] os_str = { "윈도우98", "리눅스", "윈도우10", "ms_dos", "윈도우 XP" };
	String[] cpu_str = { "AMD", "인텔", "사이릭스" };

	int i;
	
	GridLayout grid = new GridLayout(3,1);

	public ItemEvent_5(String str) {
		super(str);

		Label lbl = new Label("설치된 운영체제와 CPU 를 선택하시요");
		lbl_info = new Label();
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		
		
		
	

		for (int i = 0; i < os.length; i++) {
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);
			os[i].addItemListener(new Handler());

		}
		cbg = new CheckboxGroup();

		for (int i = 0; i < cpu.length; i++) {

			cpu[i] = new Checkbox(cpu_str[i], cbg, ( i == 1) ? true : false);
			panel2.add(cpu[i]);
			cpu[i].addItemListener(new Handler());

		}
		panel3.add(panel1);
		panel3.add(panel2);
		
		
		panel3.setLayout(grid);
		
		add("North", lbl);
		add("Center", panel3);
		add("South", lbl_info);

		setSize(400, 300);
		setVisible(true);
		setLocation(700, 300);

	}

	public static void main(String[] args) {
		new ItemEvent_5("CheckboxEvent Test");
	}

	class Handler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {

			String msg = "당신의 컴퓨터 OS는 :";
			for (int i = 0; i < os.length; i++) {
				if (os[i].getState()) {
					msg += "[" + os[i].getLabel() + "]";
				}
			}
			for (int i = 0; i < cpu.length; i++) {
				if (cpu[i].getState()) {
					msg += ", CPU :" + cpu[i].getLabel() + "입니다.";
				}
			}
			lbl_info.setText(msg);

		}
	}

}










