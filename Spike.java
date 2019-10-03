import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;


public class Spike
{
	private int x;
	private int y;
	BufferedImage buffered;
	private BufferedImage spike;
	private boolean visibility;
	
	public Spike(int xinput, int yinput)
	{
		x = xinput;
		y = yinput;
		visibility = true;
		try
        {
            spike = ImageIO.read(new File("spike.png"));
        } catch (IOException e) {}
	}
	
	public void drawMe(Graphics g)
	{
		g.drawImage(spike, x, y, null);
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
		return 50;
	}
	
	public int getHeight()
	{
		return 50;
	}
	
	
}