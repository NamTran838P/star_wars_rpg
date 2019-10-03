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


public class Stealthpod extends Items
{
	public Stealthpod(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		me = Toolkit.getDefaultToolkit().createImage("stealthpod.png");
	}
	
}

	
	
