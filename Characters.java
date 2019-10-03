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


public class Characters
{
	 int x;
	 int y;
	 int width;
	 int height;
	 int player;
	 int direction;
	 int level = 0;
	 Font font2;


	 int characterX;
	 int characterY;
	 int characterHeight;
	 int characterWidth;
	 boolean visible;
	 boolean collided;
	 
	 Image meLeft;
	 Image meRight;
	 Image meLeftS;
	 Image meRightS;
	 Image meUp;
	 Image meLightsaberS;
	 Image meLightsaberLeft;
	 Image meLightsaberRight;
     Image meFinalS;
	 Image meFinalLeft;
	 Image meFinalRight;
	
	public Characters(int xinput, int yinput, int widthinput, int heightinput)
	{
		visible = true;
		x = xinput;
		y = yinput;
		collided = false;
		font2 = new Font("Times New Roman", Font.PLAIN, 20);
		width = widthinput;
		height = heightinput;
		level = 0;
		
		
	}
	
	public void drawMe(Graphics g, boolean facingRight)
	{
		if (visible == true)
		{

				if (direction < 0)
				{
					g.drawImage(meLeftS,x,y,null);
				}
				else if (facingRight == true)
				{
					g.drawImage(meRight,x,y,null);
				}
				else if (facingRight == false)
				{
					g.drawImage(meLeft,x,y,null);
				}
			
			else if (level == 2)
			{
				if (direction < 0)
				{
					g.drawImage(meLightsaberS,x,y,null);
				}
				else if (facingRight == true)
				{
					g.drawImage(meLightsaberRight,x,y,null);
				}
				else if (facingRight == false)
				{
					g.drawImage(meLightsaberLeft,x,y,null);
				}
			}
			
		}
		

		
		
		
		
		

	}
	
	public void disappear()
	{
		visible = false;
	}
	
	public void makeVisible()
	{
		visible = true;
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
	
	public void move(int direction)
	{
		this.direction = direction;
		if (direction == 0)
		{
			if (x <= 750)
			x++;
		
			else if (x>=750)
			{
				x = 0;
			}
		}
		
		if (direction == 1)
		{
			if (y <= 500)
			y++;
		}
		
		if (direction == 2)
		{
			if (x >= 0)
			x--;
		
			else if (x <= 0)
			{
				x = 750;
			}
		}
		
		if (direction == 3)
		{
			if (y>= 320)
			y--;
		}
	}
	
	public boolean checkCollision(int characterxinput, int characteryinput, int characterwidthinput, int characterheightinput)
	{

				
				
				
				if (visible == true)
				{
					characterX =characterxinput;
					characterY = characteryinput;
					characterWidth = characterwidthinput;
					characterHeight = characterheightinput;
					if( x+width >= characterX && x <= characterX + characterWidth )
					{
					
						if( y + height >= characterY && y <= characterY + characterHeight )
						{
							collided = true;
												
						}
					}
					else
					{
						collided = false;
					}
				}
				
				
				
			

			return collided;
	}
	

		
		

}

	
	
