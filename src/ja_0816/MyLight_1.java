package ja_0816;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyLight_1 extends JFrame {
	public MyLight_1() {
		add(new MyPanel_1());
		setSize(650,600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyLight_1();
	}
	
}
class MyPanel_1 extends JPanel implements ActionListener{
	boolean flag = false;
	private int light_number = 0;
	
	public MyPanel_1() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(130,230,130));
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(200, 200, 100, 100);
		g.drawOval(300, 200, 100, 100);
		g.drawOval(400, 200, 100, 100);
		
		g.drawOval(200, 100, 100, 100);
		g.drawOval(100, 300, 100, 100);
		g.drawOval(200, 300, 100, 100);
		g.drawOval(300, 300, 100, 100);
		g.drawOval(400, 300, 100, 100);
		
		g.drawOval(300, 100, 100, 100);
		g.drawOval(100, 400, 100, 100);
		g.drawOval(200, 400, 100, 100);
		g.drawOval(300, 400, 100, 100);
		g.drawOval(400, 400, 100, 100);
		g.drawOval(400, 100, 100, 100);
		
		if(light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 100, 100, 100);
		}
		else if(light_number ==1) {
			g.setColor(Color.green);
			g.fillOval(100, 200, 100, 100);
			g.fillOval(200, 100, 100, 100);
		}
		else if(light_number ==2) {
			g.setColor(Color.yellow);
			g.fillOval(100, 300, 100, 100);
			g.fillOval(300, 100, 100, 100);
			g.fillOval(200, 200, 100, 100);
		}
		else if(light_number ==3){
			g.setColor(new Color(56,200,200));
			g.fillOval(100, 400, 100, 100);
			g.fillOval(400, 100, 100, 100);
			g.fillOval(200, 300, 100, 100);
			g.fillOval(300, 200, 100, 100);
		}
		else if(light_number == 4) {
			g.setColor(Color.blue);
			g.fillOval(300, 300, 100, 100);
			g.fillOval(200, 400, 100, 100);
			g.fillOval(400, 200, 100, 100);
			
			
		}
	
		else if(light_number == 5) {
			g.setColor(Color.black);
			g.fillOval(300, 400, 100, 100);
			g.fillOval(400, 300, 100, 100);
			
			
		}
		else {
			
			g.setColor(Color.magenta);
			g.fillOval(400, 400, 100, 100);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(++light_number>=7)
			light_number =0;
		repaint();
		
	}
}












