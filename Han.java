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


public class Han extends Characters
{
	
	private boolean knowsHan;
	private int counter;
	
	public Han()
	{
		super(200,350, 42, 117);
		knowsHan = false;
		counter = 0;
		try
        {
            meRight = ImageIO.read(new File("han.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		g.setFont(font2);
		g.setColor(Color.red);
		g.drawImage(meRight, x, y, null);
		if(collided == true && questCompleted == false)
		{
			g.drawString("Only 17000 Galactic credit from here to Alderaan?", x, y - 40);
			g.drawString("Hey kid, I do not fly for cheapies like you", x, y - 20);
			g.drawRect(x,y - 60, 420,44);
		}
		else if (collided == true && questCompleted == true)
		{
			g.drawString("My boy, let's forget about the price. You can pay", x, y - 40);
			g.drawString("me whatever you want. We take off right now...! ", x, y - 20);
			g.drawRect(x,y - 60, 420,44);
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
			System.out.println(knowsHan);
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