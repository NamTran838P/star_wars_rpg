import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Background
{
	int x;
    int y;
	
	int imaginaryy;
	int imaginaryy2;
	
	boolean upordown;
	
	private BufferedImage asteroid;
	private boolean visible;
	
    
     
    public Background()
    {
        visible = true;
        x = (int)(Math.random()*2+999);
       y = (int)(Math.random()*562+0);
        	try
        {
            asteroid = ImageIO.read(new File("asteroid.png"));
        } catch (IOException e) {}
    }
	
	public void disappear()
	{
		visible = false;
	}
     
    public void drawMe(Graphics g)
    {


		
		
		
		if (visible)
		g.drawImage(asteroid, x, y, null);

		
    }
	
	public void move()
	{
		x-=3;
		
		if (upordown == true)
		{
			y-=3;
		}
		
				
		if (upordown == false)
		{
			y+=3;
		}
		
		if (x < 0)
		{
			x = 1000;
			y = (int)(Math.random()*562+0);
			upordown = false;
			//imaginaryy = (int)(Math.random()*562+0);
			//imaginaryy2 = (int)(Math.random()*562+0);
			
		}
		
		
		if (y > 480)
		{
			
			upordown = true;
			//imaginaryy = (int)(Math.random()*562+0);
			//imaginaryy2 = (int)(Math.random()*562+0);			
		}
		
		if (y < -10)
		{
			
			
			upordown = false;
			//imaginaryy = (int)(Math.random()*562+0);
			//imaginaryy2 = (int)(Math.random()*562+0);
			
		}
		
		
		/*if (y == imaginaryy)
		{
			upordown = false;
			imaginaryy2 = (int)(Math.random()*562+0);
		}
		
		if (y == imaginaryy2)
		{
			upordown = true;
			imaginaryy = (int)(Math.random()*562+0);
		}*/
		


		
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