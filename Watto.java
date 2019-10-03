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


public class Watto extends Characters
{
	private int xcounter;
	private boolean leftorright;
	private boolean distributed;
	
	public Watto()
	{
		
		super(10, 40, 147, 175);
		distributed = false;
		leftorright = true;
		
		xcounter = 1300;
		try
        {
            meRight = ImageIO.read(new File("wattoRight.png"));
        } catch (IOException e) {}
		try
        {
            meLeft = ImageIO.read(new File("wattoLeft.png"));
        } catch (IOException e) {}

	}
	
	public void drawMe(Graphics g, boolean wattoDirection)
	{
		super.drawMe(g, wattoDirection);
		
		if(x >= 300)
		{ 
			if (distributed == false)
			{
				g.setFont(font2);
				g.setColor(Color.red);
				g.drawString("Wanted poster from Lord Jabba for Han Solo, generous", x - width - 50, 25);
				g.drawString("reward for capture! ", x - width - 50, 45);
				g.drawRect(x - width - 50,10, 430,40);
			}
			else if (distributed == true)
			{	
				g.setFont(font2);
				g.setColor(Color.red);
				g.drawString("Have fun young bounty hunter, the Force will ", x - width - 50, 25);
				g.drawString("be with you " ,x - width - 50, 45);
				g.drawRect(x - width - 50,10, 430,40);
			}
		}

	}
	
	public void distributed()
	{
		distributed = true;
	}
	
	public boolean leftorright()
	{
		return leftorright;
	}
	
	public boolean move()
	{
		xcounter--;
		if (leftorright == true)
		{
			x++;
		}
		
		if (leftorright == false)
		{
			x--;
		}
		
				
		if (x < xcounter)
		{
			leftorright = true;
		}
		if (x>xcounter)
		{
			leftorright = false;
		}
		if (xcounter == 0)
		{
			xcounter = 1300;
		}

		return leftorright;
		
		
		
	}
	
	
	
}