import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Destroyer extends Enemy
{
	
	private BufferedImage finalboss;
	private int count;
	private BufferedImage destroyerexplosion;
	public Destroyer()
    {
        super();
	    width = 550;
		height = 180;
		count = 0;
        try
        {
            finalboss = ImageIO.read(new File("destroyer.png"));
        } catch (IOException e) {}
		
		 try
        {
            destroyerexplosion = ImageIO.read(new File("destroyerexplosion.gif"));
        } catch (IOException e) {}
    }
	
	public void drawMe(Graphics g)
    {

		
		
		if (visible == true)
		{
			g.drawImage(finalboss, x, y, null);
		}
		else if (visible == false)
		{
			
			
			System.out.println(count);

			g.drawImage(destroyerexplosion, x, y, null);
		}
	
		
    }
	
	public boolean checkCollisionShip(Ship s, int xalien)
	{
		boolean collision = false; 
		
		
			int sX = s.getX();
			int sY = s.getY();
			int sWidth = s.getWidth();
			int sHeight = s.getHeight();

		if (visible == true)
		{
			if (sX + sWidth >= x && sX <= x + width && sY + sHeight >= y && sY <= y + height && xalien < 100)
			{

				collision = true;
				//visible = false; 							
			}	
		}
		
		return collision;

	}

	
	public void move()
	{
		if (visible == true)
		{
					x-=1;

				if (upordown == true)
				{
					y--;
				}
				
						
				if (upordown == false)
				{
					y++;
				}
				
				if (x < -500)
				{
					x = 800;
					y = (int)(Math.random()*562);

					
				}
				
				
				if (y > 480)
				{			
					upordown = true; 
				}
				
				if (y <-10)
				{
					upordown = false;
					
				}
				

				
				if (y == imaginaryy)
				{
					upordown = false;
					imaginaryy2 = (int)(Math.random()*562+0);
				}
				
				if (y == imaginaryy2)
				{
					upordown = true;
					imaginaryy = (int)(Math.random()*562+0);
				}
		}
		
		

		

		
	}
	
	
	public boolean checkCollision(Projectile[] p, SoundEffects se)
	{
		boolean getshot = false; 
		int pX;
		int pY;
		int pWidth;
		int pHeight;
		
		for (Projectile each : p)
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
						se.EnemyExplosion(true);
						getshot = true; 
						//visible = false; 
						count++;
				}	
			}
		
		}
		
		if (count > 15)
		{
			visible = false;
		}
		return getshot; 
		
		
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
	
}