import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
public class ProjectileEnemy
{
    int x;
    int y;
     
    int width;
    int height;
     
    Color red;
    boolean visible;
	private BufferedImage blast;
     
    public ProjectileEnemy(int x, int y)
    {
         
        this.x = x;
        this.y = y;
         
        this.width = 38;
        this.height = 14;
         
        this.red = new Color(255,0,0);
        this.visible = false;
		try
        {
            blast = ImageIO.read(new File("blast.png"));
        } catch (IOException e) {}
    }
     
    public void drawMe(Graphics g)
    {
        if( visible )
        {
           
            g.drawImage(blast, x+30,y + 66,null);
        }           
    }
     
    public void moveLeft()
    {
        if( visible )
        {
            x-=4;
        }
         
        if( x < 40 )
        {
            visible = false;
            x = 750;
        }
         
         
    }
	
	
	
	
	
     
    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }
	
	public boolean getVisible()
	{
		return this.visible; 
	}
     
    public void setY(int y)
    {
        this.y = y;
    }
	
    public void setX(int x)
    {
        this.x = x;
    }
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void reset()
	{
		x = 750;
		y = 300;
	}
}