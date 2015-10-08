// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab06vst extends Applet
{
	
	public void paint(Graphics g) 	
	{
		
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		
		
		// Draw Random Lines
		
		for (int k = 1; k <= 500; k++)
		{
			int x1 = ((int) (Math.random() * 370 + 20));
			int y1 = ((int) (Math.random() * 270 + 20));
			int x2 = ((int) (Math.random() * 370 + 20));
			int y2 = ((int) (Math.random() * 270 + 20));
			int red = ((int) (Math.random() * 256));
			int green = ((int) (Math.random() * 256));
			int blue = ((int) (Math.random() * 256));
			g.setColor(new Color(red,green,blue));
			g.drawLine(x1,y1,x2,y2);
		}
				
		// Draw Random Squares

		for (int k = 1; k <= 100; k++)
		{
			int x = ((int) (Math.random() * 330 + 410));
			int y = ((int) (Math.random() * 230 + 20));
			int red = ((int) (Math.random() * 256));
			int green = ((int) (Math.random() * 256));
			int blue = ((int) (Math.random() * 256));
			g.setColor(new Color(red,green,blue));
			g.fillRect(x,y,50,50);
		}


		
		// Draw Random Circles
		for (int k = 1; k <= 500; k++)
		{
			int x = ((int) (Math.random() * 330 + 20));
			int y = ((int) (Math.random() * 210 + 310));
			int red = ((int) (Math.random() * 256));
			int green = ((int) (Math.random() * 256));
			int blue = ((int) (Math.random() * 256));
			g.setColor(new Color(red,green,blue));
			g.drawOval(x,y,50,50);
		}



		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}



    
 