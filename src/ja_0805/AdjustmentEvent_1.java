package ja_0805;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1 extends Frame implements AdjustmentListener{	//scrollbar 에만 있는 메서드 
	
	Scrollbar r,g,b;
	Panel panel;
	
	public AdjustmentEvent_1(String str) {

		super(str);
		
		r = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);
		g = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);
		b = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,275);
		
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		
		panel = new Panel();
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		add("Center",panel);
		
		setSize(300,300);
		setVisible(true);
		setLocation(700,300);
		
	}
	public static void main(String[] args) {
			new AdjustmentEvent_1("AdjustmentEvent Test");
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {	
		int red ,green,blue;
		
		red = r.getValue();
		green = g.getValue();
		blue = b.getValue();
		
		System.out.println("red : "+red+", green : "+green+" , blue : "+blue);
		panel.setBackground(new Color(red,green,blue));
		
	}

}














