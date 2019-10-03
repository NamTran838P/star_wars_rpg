import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;


public class Berry
{
	private int x;
	private int y;
	BufferedImage buffered;
	private BufferedImage berry;
	private boolean visibility;
	
	public Berry(int xinput, int yinput)
	{
		x = xinput;
		y = yinput;
		visibility = true;
		try
        {
            berry = ImageIO.read(new File("berry.png"));
        } catch (IOException e) {}
	}
	
	public void drawMe(Graphics g)
	{
		if (visibility == true)
		{
			g.drawImage(berry, x, y, null);
		}
		
		

	}
	
	public void setVisible(boolean intake)
	{
		visibility = intake;
		
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
		return 80;
	}
	
	public int getHeight()
	{
		return 80;
	}
	
	
}