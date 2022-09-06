package ja_0810;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Graphics_5 extends Canvas{
   
   Font font = new Font("Timesroman", Font.ITALIC, 30);
   
   String str = "빨주노초파남보";
   
   Color[] color = { Color.red, Color.orange, Color.yellow,
                   Color.green, Color.blue, Color.cyan, Color.magenta};
   
   public void paint(Graphics g) {
      g.setFont(font);
      
      for (int i = 0; i < 7; i++) {
    	 g.setColor(color[i+1]);
    	 g.drawString(str.charAt(i) + " ", ( i  * 30+10 ), 110);
    	  
         g.setColor(Color.gray);
         g.drawString(str.charAt(i) + " ", ( i * 30 + 5 ), 105);
         
         g.setColor(color[i]);
         g.drawString(str.charAt(i) + " ", ( i  * 30 ), 100);
         
      }
   }   
}
