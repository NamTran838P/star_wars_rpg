import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Background2
{
	int x;
    int y;
	private boolean visible;

     
    public Background2()
    {
        visible = true;
        x = (int)(Math.random()*1000);
        y = (int)(Math.random()*562+0);
        
        
    }
     
    public void drawMe(Graphics g)
    {

		if (visible)
		{
			
		g.setColor(Color.red);
        g.fillRect(x,y,5,1);
		}
    }
	
	public void disappear()
	{
		visible = false;
	}
	public void move()
	{
		x--;
		
		if (x < 0)
		{
			y = (int)(Math.random()*562+0);
			x = 1000;
		}
		


		
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	

}