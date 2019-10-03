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


public class Items
{
	 int x;
	 int y;
	 int width;
	 int height;
	 int player;
	 int direction;
	 int count;

	 int characterX;
	 int characterY;
	 int characterHeight;
	 int characterWidth;
	 boolean visible;
	 boolean collided;


	 Image me;
	 
	
	public Items(int xinput, int yinput, int widthinput, int heightinput)
	{
		visible = true;
		collided = false;
		x = xinput;
		y = yinput;
		characterX = 0;
		characterY = 0;
		characterHeight = 0;
		characterWidth = 0;
		direction =  -1;
		

		
		width = widthinput;
		height = heightinput;
		
		
	}
	
	public void drawMe(Graphics g, int numItems)
	{
			if (visible)
			{
				g.drawImage(me,x,y,null);
			}
			else 
			{
				if (numItems < 2)
				{
					g.drawImage(me,1000-100-width/2,20 + (numItems*100),null);
				}
				if (numItems == 2)
				{
					g.drawImage(me,1000-100-width/2,170,null);
				}
				if (numItems ==3)
				{
					g.drawImage(me,1000-100-width/2,250,null);
				}
				if (numItems ==4)
				{
					g.drawImage(me,1000-100-width/2,330,null);
				}
				if (numItems ==5)
				{
					g.drawImage(me,1000-100-width/2,400,null);
				}
				
			}
			
		
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
	

	
	public void changeLocation (int xinput, int yinput, boolean leftorright, int level)
	{
		if (visible == true && level == 2)
		{
			if (leftorright)
			{
				x = xinput + 80;
				y = yinput + 40;
			}
			else 
			{
				x = xinput- 20;
				y = yinput + 40;
			}
			
		}
		else if (visible == true && level == 3)
		{
			x = xinput;
			y = yinput;
		}
		
	}
	
	
	public boolean checkCollision(int characterxinput, int characteryinput, int characterwidthinput, int characterheightinput)
	{
		

			characterX =characterxinput;
			characterY = characteryinput;
			characterWidth = characterwidthinput;
			characterHeight = characterheightinput;
			
			//Check the x positions for collision 
			if( x+width >= characterX && x <= characterX + characterWidth )
			{
				//Check the y positions for collision 
				if( y + height >= characterY && y <= characterY + characterHeight )
				{
					collided = true;
					visible = false;
					
				}
			}
			else
			{
					collided = false;
			}
		
		
		return collided;
	}
	
	public boolean inInventory()
	{
		return !visible;
	}
	
	public void taken()
	{
		visible = false;
	}
	

	

		
		

}

	
	
