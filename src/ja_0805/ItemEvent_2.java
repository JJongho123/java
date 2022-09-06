package ja_0805;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;

public class ItemEvent_2 extends Frame{
	
	CheckboxGroup group;
	Checkbox cb1 , cb2 ,cb3;
	Checkbox cb11 , cb22 ,cb33;
	
	public ItemEvent_2(String str) {
		super(str);
		CheckboxGroup group2 = new CheckboxGroup();
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red",group,false);
		cb2 = new Checkbox("green",group,true);
		cb3 = new Checkbox("blue",group,false);
		
		cb11 = new Checkbox("red",group,false);
		cb22 = new Checkbox("green",group,true);
		cb33 = new Checkbox("blue",group,false);
		
		
		
		cb1.addItemListener(new Handler());
		cb2.addItemListener(new Handler());
		cb3.addItemListener(new Handler());
		
		add(cb1);
		add(cb2);
		add(cb3);
		
		cb11.addItemListener(new Handler());
		cb22.addItemListener(new Handler());
		cb33.addItemListener(new Handler());
		
		add(cb11);
		add(cb22);
		add(cb33);
		
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		setSize(300,300);
		setVisible(true);
		setLocation(700,300);
		
		
	}
	public static void main(String[] args) {
		new ItemEvent_2("Radio CheckBox Test@@");
		
	}
	class Handler implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			
			Checkbox cb = (Checkbox)e.getSource();
			
			String color = cb.getLabel();	
			
			if(color.equals("red")) {
				setBackground(Color.red);
			}
			else if(color.equals("green")) {
				setBackground(Color.green);
			}
			else if(color.equals("blue")) {
				setBackground(Color.blue);
			}
			
		}
	}
	
}















