package ja_0804;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1 extends Frame {

	Window[] win = new Window[220];
	Color[] color = { Color.red, Color.yellow, Color.green };
	int x, y = 0;

	public Window_1(String str) {
		super(str);

		for (int i = 0; i < 220; i++) {
			win[i] = new Window(this);
			win[i].setBackground(color[i % 3]);

			Label lbl = new Label(i + "번 윈도우");

//			if (i/10==0||i/10==2){
			if ((i / 10) % 2 == 0&&i<70) {
				x += 10;
				y += 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
			} 
			else if (!((i / 10) % 2 == 0)&& i < 70) {
				x += 10;
				y -= 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
			} 
			else if ((i / 10) % 2 == 0&&i>=70&&i<120) {
				x += 10;
				y += 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
				
			}
			else if (!((i / 10) % 2 == 0)&& i>=70&&i<120) {
				x -= 10;
				y += 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
		
			}  
			else if(((i / 10) % 2 == 0)&&i>=120&&i<170){
				x -= 10;
				y -= 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
			}
			else if (!((i / 10) % 2 == 0)&& i>=120&&i<170) {
				x -= 10;
				y += 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
		
			}
			else if (((i / 10) % 2 == 0)&& i>=170&&i<220) {
				x -= 10;
				y -= 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
		
			}  
			else {
				x += 10;
				y -= 10;
				win[i].add(lbl);
				win[i].setBounds(x + 100, y + 100, 100, 100);
			}
			
			
			

			
			
			
			
			
			win[i].setVisible(true);
		}

		setLocation(90, 90);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Window_1("윈도우");
	}

}
