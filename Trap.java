import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;


public class Trap
{
	private int x;
	private int y;
	BufferedImage buffered;
	private BufferedImage trap;
	private boolean visibility;
	
	public Trap(int xinput, int yinput)
	{
		x = xinput;
		y = yinput;
		visibility = true;
		try
        {
            trap = ImageIO.read(new File("trap.png"));
        } catch (IOException e) {}
	}
	
	public void drawMe(Graphics g)
	{
		g.drawImage(trap, x, y, null);
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
		return 90;
	}
	
	public int getHeight()
	{
		return 90;
	}
	
	
}