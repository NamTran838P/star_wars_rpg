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


public class Vader extends Characters
{
	private int count;
	public Vader()
	{
		super(700,450, 112, 120);
		count = 0;
		try
        {
            meRight = ImageIO.read(new File("vader.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		count++;
		g.drawImage(meRight, x, y, null);
		g.setFont(font2);
		g.setColor(Color.red);
		if (count > 150 && count < 300)
		{
			
		g.drawString("It is pointless to resist, my son. Now you must know that", x - 300, y - 40);
		g.drawString("there is no way back from the dark side of the Force.",x - 300, y - 20);
		g.drawRect(x - 300,y - 60, 450,44);
		}
		if (count > 500)
		{
			count = 0;
		}
	}
	
	
	
}