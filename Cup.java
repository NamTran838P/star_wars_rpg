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


public class Cup extends Characters
{
	private boolean applied;
	public Cup()
	{
		super(580,250, 100, 100);
		applied = false;
		try
        {
            meRight = ImageIO.read(new File("cup.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean applied)
	{
	
		g.drawImage(meRight, x, y, null);
		g.setFont(font2);
		g.setColor(Color.red);
		if (collided && applied == false)
		{
			g.drawString("Press g to apply laxative!", x - 100, y - 40);
			g.drawRect(x - 100,y - 55, 200,20);
		}
		else if (collided && applied)
		{
			g.drawString("Laxative applied! Enjoy your coffee!", x - 100, y - 40);
			g.drawRect(x - 100,y - 55, 300,20);
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
	
	public boolean applied()
	{
		return applied;
	}
	
	public void reset()
	{
		applied = false;
	}
	
	
	
}