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


public class Stormtroopers extends Characters
{
	
	private boolean knowsHan;
	private int counter;
	
	public Stormtroopers()
	{
		super(300,480, 200, 140);
		knowsHan = false;
		counter = 0;
		try
        {
            meRight = ImageIO.read(new File("stormtroopers.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		g.setFont(font2);
		g.setColor(Color.red);
		g.drawImage(meRight, x, y, null);
		if(collided == true)
		{
			g.drawString("Let me see your identification!", x, y);
			g.drawRect(x,y - 20, 250,30);
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
					counter++;					
				}
			}
			else
			{
				collided = false;
			}
		}
				
				
				
			

		return collided;
	}
	
	public boolean knowsHan()
	{
		if (counter>0)
		{
			knowsHan = true;
		}
		return knowsHan;
	}
	
	
	
}