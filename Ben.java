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


public class Ben extends Characters
{
	public Ben()
	{
		super(10,320, 30, 72);
		
		try
        {
            meRight = ImageIO.read(new File("ben.png"));
        } catch (IOException e) {}
		
	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		if (visible == true)
		{
			g.setFont(font2);
			g.drawImage(meRight, x, y, null);
			if(collided == true && questCompleted == false)
			{
				g.drawString("Where is your landspeeder and GPS? I am hungry,", 15, 315);
				g.drawString("I am not gonna walk home!", 15, 335);
				g.drawRect(10,300, 400,40);
			}
			else if (collided == true && questCompleted == true)
			{
				g.drawString("Let's go, my lad, I am hungry", 15, 315);
				g.drawString("We will eat and I'll show you your toy", 15, 335);
				g.drawRect(10,300,300,40);
			}
		}
	}
	
	public void changeLocation(int xinput, int yinput)
	{
		x = xinput;
		y = yinput;
	}
	
	
	
}