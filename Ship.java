import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Ship
{
	int x;
	int y;
	
	
	int width;
	int height;
	private BufferedImage spaceship;
	private BufferedImage Shipexplosion;
	boolean crash = false;
	boolean decreasebyone = false; 
	private boolean visible;
	int count;
	
	public Ship(int x, int y)
	{
		visible = true;
		this.x = x;
		this.y = y;
		
		this.width = 128;
		this.height = 148;
		count = 0;
		try
        {
            spaceship = ImageIO.read(new File("xwing.png"));
        } catch (IOException e) {}
		
		try
        {
            Shipexplosion = ImageIO.read(new File("shipexplosion.png"));
        } catch (IOException e) {}
		

	}
	

	public void disappear()
	{
		visible = false;
	}
	
	public void drawMe(Graphics g)
	{
		count++;
		if (visible && crash == false)
		{
			g.drawImage(spaceship, x, y, null);
			if (count > 50 && count < 120)
			{
				g.drawRect(x,y - 20, 280,30);
				g.setColor(Color.red);
				g.drawString("Red Five, standing by!", x, y);
			}
			
			if (count >350 && count < 450)
			{
				g.drawRect(x,y - 20, 280,30);
				g.setColor(Color.red);
				g.drawString("I can't shake it!", x, y);
			}
			
			if (count >600 && count < 700)
			{
				g.drawRect(x,y - 20, 280,30);
				g.setColor(Color.red);
				g.drawString("Hang on, almost there!", x, y);
			}
		}
		
		else if (visible && crash == true)
		{
			g.drawImage(Shipexplosion, x, y, null);	
			
			g.drawRect(x,y - 20, 300,30);
			g.setColor(Color.red);
			g.drawString("Ahh... I am done. May day!", x, y);
		}
		
			
		
	}
	
	public void drawCollision(boolean explosion)
	{
		if (explosion == true)
		{
			crash = true;
			count = 0;
		}
		
		else if(explosion == false)
		{
			crash = false; 
			
		}
		
		

		
	}
	
		public boolean checkCollision(ProjectileEnemy[] p, SoundEffects se)
	{
		boolean getshot = false; 
		int pX;
		int pY;
		int pWidth;
		int pHeight;
		
		for (ProjectileEnemy each : p)
		{
			pX = each.getX();
			pY = each.getY();
			pWidth = each.getWidth();
			pHeight = each.getHeight();
		
		

			if (visible == true && each.getVisible() == true)
			{

				
				if (pX + pWidth >= x && pX <= x + width && pY + pHeight >= y && pY <= y + height)
				{
						
						each.setVisible(false); 
						
						getshot = true; 

						
				}	
			}
		
		}
		return getshot; 
		
		
	}
	
	public void move(int shipdirection)
	{
		if (shipdirection == 1)
		{
			if (y>50)
			y-=5;
		}
		else if (shipdirection == 2)
		{
			if (y < 500)
			y+=5;
		}
		else if (shipdirection == 3)
		{
			if (x < 750)
			{
			x+=5;
			}
		}
		else if (shipdirection == 4)
		{
			if (x > 30)
			{
				x-=5;
			}
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
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void reset()
	{
		visible = true;
		x = 50;
		y = 300;
	}


}
