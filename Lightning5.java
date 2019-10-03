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


public class Lightning5 extends Characters
{
	private int count;
	public Lightning5()
	{
		super(600,400, 128, 192);
		count = 0;
		meRight = Toolkit.getDefaultToolkit().createImage("lightning.gif");
	}
	
	public void drawMe(Graphics g, boolean questCompleted)
	{
		count++;
		g.setFont(font2);
		g.setColor(Color.red);
		if (visible)
		{
			if (count > 200 && count <400) 
			g.drawImage(meRight,x,y,null);
			if (count > 400)
			count = 0;
		}
		
		
	}
	
	
	
}