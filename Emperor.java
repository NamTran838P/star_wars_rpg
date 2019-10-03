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


public class Emperor extends Characters
{
	private int count;
	public Emperor()
	{
		super(350,70, 0, 0);
		count = 0;
		
	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		count++;
		g.setFont(font2);
		g.setColor(Color.red);
		if (count > 100 && count < 400)
		{
			g.drawString("The Force is strong with you, young Skywalker. Let the hate and anger", x - 150, y);
			g.drawString("consume you!", x - 150, y + 20);
			g.drawRect(x - 150, y - 20, 550,50);
		}
		if (count >600 && count < 900)
		{
			g.drawString("Spectacular fighting, fantastic. [Hands clapping] Young Jedi Knight, you", x - 150, y);
			g.drawString("have done well", x - 150, y + 20);
			g.drawRect(x - 150, y - 20, 600,50);
		}
		if (count >1100 && count < 1400)
		{
			g.drawString("Destroy him, young Skywalker, and take your father's place on my side. You", x - 150, y);
			g.drawString("will see the power of the dark side", x - 150, y + 20);
			g.drawRect(x - 150, y - 20, 600,50);
		}
		
		if (count >1800 && count < 2100)
		{
			g.drawString("By now you must know that your father cannot be turned from the dark side of", x - 150, y);
			g.drawString("the Force", x - 150, y + 20);
			g.drawRect(x - 150, y - 20, 600,50);
		}
		if (count > 2100)
		{
			count = 0;
		}
	}
	
	
	
}