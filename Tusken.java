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


public class Tusken extends Characters
{
	

	int imaginaryx;
	int imaginaryx2;
	int imaginaryy;
	int imaginaryy2;
	boolean leftorright; 
	boolean upordown;
	
	public Tusken(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		leftorright = true;
		upordown = false;

		
		meRight = Toolkit.getDefaultToolkit().createImage("tuskenraider.gif");
		
	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		
		if (visible)
		{
			g.setFont(font2);
			g.drawImage(meRight, x, y, null);
			if(collided == true)
			{
				g.drawString("Young lad, gimme whatever you have, now!", x, y - 40);
				g.drawString("HOHOHOHOHO", x, y - 20);
				//g.drawRect(445,255,270,40);
				g.drawRect(x,y-55,300,40);
			
			}
		}
			
		
		

	}
	
	public void move()
	{
		if (leftorright == true)
		{
			x++;
		}
		
		if (leftorright == false)
		{
			x--;
		}
		
		if (upordown == true)
		{
			y--;
		}
		
				
		if (upordown == false)
		{
			y++;
		}
		
		if (x <0)
		{
			x = 680;
			y = (int)(Math.random()*351+250);
			imaginaryx = (int)(Math.random()*410+200);
			imaginaryx2 = (int)(Math.random()*410+200);
			imaginaryy = (int)(Math.random()*401+200);
			imaginaryy2 = (int)(Math.random()*401+200);
			leftorright = true; 
		}
		
		if (x > 680)
		{
			x = 680;
			y = (int)(Math.random()*351+250);
			imaginaryx = (int)(Math.random()*410+200);
			imaginaryx2 = (int)(Math.random()*410+200);
			imaginaryy = (int)(Math.random()*401+200);
			imaginaryy2 = (int)(Math.random()*401+200);
			leftorright = false; 
		}
		
		if (y > 600)
		{
			x = 680;
			y = (int)(Math.random()*351+250);
			imaginaryx = (int)(Math.random()*410+200);
			imaginaryx2 = (int)(Math.random()*410+200);
			imaginaryy = (int)(Math.random()*401+200);
			imaginaryy2 = (int)(Math.random()*401+200);
			leftorright = false; 
		}
		
		if (x == imaginaryx)
		{
			leftorright = true;
			imaginaryx2 = (int)(Math.random()*410+200);
		}
		
		if (x == imaginaryx2)
		{
			leftorright = false; 
			imaginaryx = (int)(Math.random()*410+200);
			
		}
		
		if (y == imaginaryy)
		{
			upordown = false;
			imaginaryy2 = (int)(Math.random()*410+200);
		}
		
		if (y == imaginaryy2)
		{
			upordown = true;
			imaginaryy = (int)(Math.random()*410+200);
		}
		
		if (y == 201)
		{
			upordown = false;
			imaginaryy = (int)(Math.random()*410+200);
			imaginaryy2 = (int)(Math.random()*410+200);
		}
		

		
	}
	
	
	
}