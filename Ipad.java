import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Toolkit;


public class Ipad extends Items
{
	public Ipad(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		me = Toolkit.getDefaultToolkit().createImage("ipad.png");
	}
	
	public void drawMe(Graphics g, int numItems)
	{
			if (visible)
			{
				g.drawImage(me,x,y,null);
			}
			else
			{
				g.drawImage(me,1000-100-width/2,20 + (numItems*100),null);
			}
			
		
	}
		
		

}

	
	
