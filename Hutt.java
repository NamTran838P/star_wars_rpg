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


public class Hutt extends Characters
{
	public Hutt()
	{
		super(350,380, 123, 62);
		
		try
        {
            meRight = ImageIO.read(new File("hutt.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		
		g.drawImage(meRight, x, y, null);
		g.setFont(font2);
		g.setColor(Color.red);
		if(collided == true && questCompleted == false)
		{
			g.drawString("That flying creature is good for nothing. So far no poster", x, y - 40);
			g.drawString("distributed. What a lazy stinking bird. Press g for a poster", x, y - 20);
			g.drawRect(x,y - 60, 470, 44);
		}
		else if (collided == true && questCompleted == true)
		{
			g.drawString("You know where that good-for-nothing smuggler is? ", x, y - 40);
			g.drawString("Very good young man. Tell him that he and I will have a talk",x, y - 20);
			g.drawRect(x,y - 60, 480,44);
		}
	}
	
	
	
}