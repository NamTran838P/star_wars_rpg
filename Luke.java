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


public class Luke extends Characters
{
	
	private Image leftStrike;
	private Image rightStrike;
	public Luke()
	{
		super(750,500, 35, 67);
		meLeft = Toolkit.getDefaultToolkit().createImage("lukeLeft.gif");
		meRight = Toolkit.getDefaultToolkit().createImage("lukeRight.gif");
		meLeftS = Toolkit.getDefaultToolkit().createImage("lukeLeftS.gif");
		meRightS = Toolkit.getDefaultToolkit().createImage("lukeRightS.gif");
		meUp = Toolkit.getDefaultToolkit().createImage("lukeUp.gif");
		
		meLightsaberS = Toolkit.getDefaultToolkit().createImage("lukeLightsaberS.png");
		meLightsaberRight = Toolkit.getDefaultToolkit().createImage("lukeLightsaberRight.gif");
		meLightsaberLeft= Toolkit.getDefaultToolkit().createImage("lukeLightsaberLeft.gif");
		
		meFinalS = Toolkit.getDefaultToolkit().createImage("lukeFinalS.gif");
		meFinalRight = Toolkit.getDefaultToolkit().createImage("lukeFinalRight.gif");
		meFinalLeft= Toolkit.getDefaultToolkit().createImage("lukeFinalLeft.gif");
		
		leftStrike = Toolkit.getDefaultToolkit().createImage("leftStrike.gif");
		rightStrike = Toolkit.getDefaultToolkit().createImage("rightStrike.gif");
	}
	
	public void drawMe(Graphics g, boolean facingRight, boolean questCompleted)
	{
		
		g.setFont(font2);
		g.setColor(Color.red);
		if (visible == true)
		{
			if (level == 1)
			{
				super.drawMe(g, facingRight);
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
				if(collided == true && questCompleted == false)
				{
					g.drawString("Will you fly us to Alderaan? I will pay you 17000 Galactic", x, y - 40);
					g.drawString("credit. I think that is fair", x, y - 20);
					g.drawRect(x,y - 60, 450,44);
				}
				else if (collided == true && questCompleted == true)
				{
					g.drawString("There someone named Jabba the Hutt looking for you, Sir. I", x, y - 40);
					g.drawString("do not think he is a very good guy.",x, y - 20);
					g.drawRect(x,y - 60, 450,44);
				}
			}
			else if (level == 4)
			{
				
				if (direction < 0)
				{
					g.drawImage(meFinalS,x,y,null);
				}
				else if (facingRight == true)
				{
					g.drawImage(meFinalRight,x,y,null);
				}
				else if (facingRight == false)
				{
					g.drawImage(meFinalLeft,x,y,null);
				}
				
				
				if(questCompleted && collided)
				{
					g.drawString("I will not be seduced to the dark side of the Force like my", x - 200, y - 40);
					g.drawString("father was", x - 200, y - 20);
					g.drawRect(x- 200,y - 60 , 450,44);
					g.drawImage(rightStrike,x,y,null);
				}
			
					

			}
			
			
		}
		
	}
	

	
	public void move(int direction)
	{
		this.direction = direction;
		if (direction == 0)
		{
			if (level == 2)
			{
				if (x <= 500 && y >= 350)
				x++;
				else if (x>=750)
				{
					x = 0;
				}
			
				else if (x >= 500 && y >= 500)
				x++;
			}
			
			else if (level == 4)
			{
				if (x<670 && y > 500)
				{
					x++;
				}
				else if (x < 580 && y < 500)
				{
					x++;
				}	
				
			}
		
			else
			{
				if (x <= 750)
				x++;
			
				else if (x>=750)
				{
					x = 0;
				}
			}
			
				
		
			
		}
		
		if (direction == 1)
		{
			if (y <= 500)
			y++;
		}
		
		if (direction == 2)
		{
			if (level == 2)
			{
					if (y >=350 && x >= 200)
					x--;
				
							
					else if (x <= 0)
					{
						x = 750;
					}
					
					else if ( x <= 200 && y>=450)
					{
						x--;
					}
			}
			else if (level==4)
			{
				if (x >5)
				{
				x--;
				}
				
			}
			else
			{
				if (x >= 0)
				x--;
			
				else if (x <= 0)
				{
					x = 750;
				}
			}
			
		}
		
		if (direction == 3)
		{
			if (level == 2)
			{
				if (x <= 700 && y > 530)
				{
					y--;
				}
				else if (x <= 650 && y > 500)
				y--;
				else if (x <= 550 && y > 450)
				{
					y--;
				}
				else if (x <= 500 && y > 400)
				{
					y--;
				}
				else if (x <= 450 && y > 350)
				{
					y--;
				}
				
			}
			else 
			{
				if (y>= 320)
				y--;
			}
			
		}
	}
	
	public void changeLocation(int xinput, int yinput)
	{
		x = xinput;
		y = yinput;
	}
	
	public void increaseLevel()
	{
		level++;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	
}