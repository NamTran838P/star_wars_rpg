import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.SwingUtilities;


public class Screen extends JPanel implements KeyListener, ActionListener, MouseListener
{
	BufferedImage buffered;
	private ArrayList<Berry> b;
	private ArrayList<Spike> s;
	private ArrayList<Trap> t;
	private Image yodatraining, dagobahlanding, father;
	private int direction;
	private boolean knowsHan;
	private Cup cup;
	private int before;
	private int call1;
	private int call2;
	private boolean losebytrap;
	private int screen;
	private SoundEffects se;
	private JButton restart; 
	private JButton start;
	private JButton level2;
	private JButton level3;
	private JButton gameOver;
	private BufferedImage mainMenu;
	private BufferedImage mainMenu2;
	private BufferedImage level1background;
	private BufferedImage level2background;
	private Image falcon; 
	private Image cantina;
	private boolean level2Completed;
	private Watto watto;
	private int wattoCounter; 
	private Image yavin2;
	private JButton level4;
	private BufferedImage binarySunset;
	private boolean mainMenus;
	private Image mainMenuAnimate;
	private Image lightsaberscene;
	private int counter1;
	private boolean animate;
	private boolean change;
	private boolean facingRight;
	private int sequence;
	private Font font;
	private boolean raided;
	private Image deathstardestroyed;
	private JButton endGame;
	private Image level4background;
	private ArrayList<Items>myItems;
	private boolean wattoDirection;
	private boolean hanWillFly;
	private boolean level1Completed;
	private Luke luke;
	private Han han;
	private Ben ben;
	private Tusken tusken1;
	private Tusken tusken2;
	private Stormtroopers stormtroopers;
	private Hutt hutt;
	private Landspeeder landspeeder;
	private Poster poster;
	private Image yavin;
	private Image emperordying;
	private boolean level3Completed;
	private boolean collisionlightning;
	private boolean level4Completed;
	
    Projectile[] p1;
	ProjectileEnemy[] p2;
    Ship s1;
	private Emperor emperor;
	private Image endcredits;
	Enemy[] enemy;
	private ArrayList<Characters> lightning;
	private Lightning1 lightning1;
	private Lightning2 lightning2;
	private Lightning3 lightning3;
	private Lightning4 lightning4;
	private Lightning5 lightning5;
	private Lightning6 lightning6;
	Background[] background;
	Background2[] background2;
	boolean level1 = true;
	boolean applied;
	
	int livesbefore = 3;
	int level;
	int count = 0;
	int enemylives=0;
	int firedalready = 0;
	int enemyliveslevel1 = 3;
	int enemyliveslevel1before = 3;
	int enemyliveslevel2 = 6;
	int enemyliveslevel2before = 6;
	int enemyliveslevel3 = 6;
	int enemyliveslevel3before = 6;
	int xalien; 
	boolean getshot = false;
	boolean decreaseenemylives= false; 
	boolean collided = false;
	int counter = 0;
	int shipdirection;
	boolean shipdown;
	boolean crashornot = false;
	private int firedalreadyenemy;
	private BufferedImage Level1;
	private BufferedImage Level2;
	private BufferedImage Level3;
	private BufferedImage Endscreen;
	private BufferedImage Shipexplosion;
	private boolean destroyercollision;
	private int time;
	private Vader vader;

	public Screen()
	{
		s1 = new Ship(50,300);
		enemy = new Enemy[6];
		emperor = new Emperor();
		shipdirection = 0;
		time = 0;
		firedalreadyenemy = 0;
		background = new Background[3];
        p1 = new Projectile[100];
		p2 = new ProjectileEnemy[100];
		background2 = new Background2[200];
		level = 0;
		destroyercollision = false;
		level4Completed = false;
		vader = new Vader();
		lightning = new ArrayList<Characters>();
		lightning1 = new Lightning1();
		lightning2 = new Lightning2();
		lightning3 = new Lightning3();
		lightning4 = new Lightning4();
		lightning5 = new Lightning5();
		lightning6 = new Lightning6();
		collisionlightning = false;
		lightning.add(lightning1);
		lightning.add(lightning2);
		lightning.add(lightning3);
		lightning.add(lightning4);
		lightning.add(lightning5);
		lightning.add(lightning6);
		cup = new Cup();
		
		for(int i = 0; i < p1.length; i++)
        {
            p1[i] = new Projectile(50, 300);
        }
		
		for(int i = 0; i < p2.length; i++)
        {
            p2[i] = new ProjectileEnemy(750, 300);
        }
		
		
		for(int i = 0; i < enemy.length-1; i++)
        {
            enemy[i] = new Enemy();
        }
		enemy[5] = new Destroyer();
		for(int i = 0; i < background.length; i++)
        {
            background[i] = new Background();
        }
		
		for(int i = 0; i < background2.length; i++)
        {
            background2[i] = new Background2();
        }
		try
        {
            Level1 = ImageIO.read(new File("Level 1.png"));
        } catch (IOException e) {}
		
		try
        {
            Level2 = ImageIO.read(new File("Level 2.png"));
        } catch (IOException e) {}
		
		try
        {
            Level3 = ImageIO.read(new File("Level 3.png"));
        } catch (IOException e) {}
		
		try
        {
            Endscreen = ImageIO.read(new File("End screen.png"));
        } catch (IOException e) {}
		
		
		
		level3Completed = false;
		
		hanWillFly = false;
		knowsHan = false;
		wattoDirection = false;
		wattoCounter = 0;
		raided = false;
		b = new ArrayList<Berry>();
		s = new ArrayList<Spike>();
		t = new ArrayList<Trap>();
		se = new SoundEffects();
		applied = false;
		sequence = 0;
		counter1 = 0;
		animate = true;
		change = false;
		facingRight = true;
		luke = new Luke();
		han = new Han();
		hutt = new Hutt();
		tusken1 = new Tusken(400,290, 100, 100);
		tusken2 = new Tusken(460,260, 100, 100);
		stormtroopers = new Stormtroopers();
		ben = new Ben();
		level1Completed = false;
		level2Completed = false;
		myItems = new ArrayList<Items>();
		myItems.add(new Landspeeder(650,320, 148, 125));
		myItems.add(new Ipad(300,320, 20, 26));
		myItems.add(new Lightsaber(0,0,48,48));
		watto = new Watto();		
		myItems.add(new Poster(watto.getX(),watto.getY(),50,62));
		
		myItems.add(new Stealthpod(1000,0,50,50));
		myItems.add(new Laxative(100,250,82,162));

		falcon = Toolkit.getDefaultToolkit().createImage("falcon.png");
		endcredits = Toolkit.getDefaultToolkit().createImage("endcredits.gif");
		yavin = Toolkit.getDefaultToolkit().createImage("yavin.gif");
		yavin2 = Toolkit.getDefaultToolkit().createImage("yavin2.gif");
		dagobahlanding = Toolkit.getDefaultToolkit().createImage("dagobahlanding.gif");
		yodatraining = Toolkit.getDefaultToolkit().createImage("yodatraining.png");
		father = Toolkit.getDefaultToolkit().createImage("father.png");

		try
        {
            mainMenu = ImageIO.read(new File("mainMenu.png"));
        } catch (IOException e) {}
		
		try
        {
            mainMenu2 = ImageIO.read(new File("mainMenu2.png"));
        } catch (IOException e) {}
		
		
		
		try
        {
            binarySunset = ImageIO.read(new File("binarySunset.png"));
        } catch (IOException e) {}
		
		try
        {
            level1background = ImageIO.read(new File("level1background.png"));
        } catch (IOException e) {}
		
		try
        {
            level2background = ImageIO.read(new File("moseisley.png"));
        } catch (IOException e) {}
		
		font = new Font("Times New Roman", Font.PLAIN, 25);
		
		call1 = -1;
		call2 = -1;
		direction = -2;
		wattoCounter = 0;
		screen = 0;
		mainMenus = true;
		mainMenuAnimate = Toolkit.getDefaultToolkit().createImage("mainMenu.gif");
		lightsaberscene = Toolkit.getDefaultToolkit().createImage("lightsaberscene.gif");
		cantina = Toolkit.getDefaultToolkit().createImage("cantina.gif");
		deathstardestroyed = Toolkit.getDefaultToolkit().createImage("deathstardestroyed.gif");
		level4background = Toolkit.getDefaultToolkit().createImage("level4background.png");
		emperordying = Toolkit.getDefaultToolkit().createImage("emperordying.gif");


		addMouseListener(this);
		setFocusable(true);
        addKeyListener(this);
		setLayout(null);  
		
		
		
		start = new JButton("Start"); 
		start.setBounds(410,450,200,30);
		start.addActionListener(this); 
		start.setFocusable(false);
		
		endGame = new JButton("Finish"); 
		endGame.setBounds(100,0,200,30);
		endGame.addActionListener(this); 
		endGame.setFocusable(false);
		
		level2 = new JButton("Proceed to level 2"); 
		level2.setBounds(100,0,200,30);
		level2.addActionListener(this); 
		level2.setFocusable(false);
		
		level3 = new JButton("Proceed to level 3"); 
		level3.setBounds(100,0,200,30);
		level3.addActionListener(this); 
		level3.setFocusable(false);
		
		level4 = new JButton("Proceed to level 4"); 
		level4.setBounds(100,0,200,30);
		level4.addActionListener(this); 
		level4.setFocusable(false);
		
		gameOver = new JButton("Game Over! Restart Level?"); 
		gameOver.setBounds(100,0,200,30);
		gameOver.addActionListener(this); 
		gameOver.setFocusable(false);
		
		se.mainMenu(true);

		add(start);
				

			

	}

	public Dimension getPreferredSize()
	{
		
		return new Dimension(1000,562);
	}

	public void paintComponent(Graphics g)
	{
		
		g.setColor(Color.white);
		g.setFont(font);
		if (screen == 0)
		{
			
			

			g.setColor(Color.white);
			g.fillRect(0,0,1000,562);
			if(animate == true)
			{
				
				g.drawImage(mainMenuAnimate, 0, 0, null);
			}
			else
			{
				if(change)
				g.drawImage(mainMenu, 0, 0, null);
			
				else
					g.drawImage(mainMenu2, 0, 0, null);
			}
			
			start.setFont(font);
			g.drawString("WASD for movements. X-Wing: arrows for movements, space for blaster. Touch items to pick up.",0,530);
			
			
		}
		
		else if (screen == 1) //level 1
		{
			
			g.fillRect(0,0,1000,562);
			g.drawImage(binarySunset,0,0,null);
			if (sequence == 0)
			{
				g.drawString("It is a period of chaos. Luke Skywalker, a humble farmboy, was just ambushed by bandits when he ",8,460);
				g.drawString("was running errands for his uncle. He was saved by an old man who called himself Ben Kenobi. ",8,485);

				g.drawString("The name Ben Kenobi reminds Luke of one of his relatives that his uncle mentioned. Luke was",8,511);
				g.drawString("intrigued by this man, who seems to be very powerful.",8,535);
			}
			else if (sequence == 1)
			{
				g.drawString("But first, Luke must retrieve his landspeeder and then rendezvous with Ben Kenobi. Avoid the ",8,460);
				g.drawString("remaining bandits though.",8,485);

				
			}
			else if (sequence == 2)
			{
				
				g.fillRect(0,0,1000,562);
				//Color ground = new Color(204,204,0);
				
				g.drawImage(level1background,0,0,null);
				g.setColor(Color.black);
				g.fillRect(800,0,200,600);
				g.setColor(Color.black);
				g.drawString("Level: " + screen, 5, 25);
				luke.drawMe(g,facingRight, level1Completed);
				ben.drawMe(g,level1Completed);
				tusken1.drawMe(g, level1Completed);
				tusken2.drawMe(g, level1Completed);
				
				for (int i = 0; i < 2;i++)
				{
					myItems.get(i).drawMe(g,i);
					myItems.get(i).checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());
				}

				
			
				g.setColor(Color.white);
				g.setFont(font);
				g.drawString("Inventory", 850, 25);
				
			}
		}
		
		else if (screen == 2) //level 2
		{
			

			if(sequence == 3)
			{
				g.setColor(Color.black);
				g.fillRect(0,0,1000,562);
				g.drawImage(lightsaberscene,0,0,null);
				g.setColor(Color.black);
				g.fillRect(700,500,300,62);
				g.setColor(Color.white);
				g.drawString("Luke wields the lightsaber for the first time and learns about the Jedi. Ben convinces him to",8,520);
				g.drawString("to join study the Force, mentioning Luke's father as the best Starfighter pilot in the Galaxy. ",8,545);
			}
			else if (sequence == 4)
			{
				g.drawImage(lightsaberscene,0,0,null);
				g.setColor(Color.black);
				g.fillRect(700,500,300,62);
				g.setColor(Color.white);
				g.drawString("Luke now joins Ben to fight against the Empire and take revenge against Darth Vader whom Ben",8,520); 
				g.drawString("told Luke has killed Luke's father.",8,545);
			}
			else if(sequence == 5)
			{
				g.setColor(Color.black);
				g.fillRect(0,0,1000,562);
				g.drawImage(cantina,0,0,null);
				g.setColor(Color.black);
				g.fillRect(700,500,300,62);
				g.setColor(Color.white);
				g.drawString("Ben and Luke are looking for a spaceship to get to find Princess Leia. There are plenty of",8,520); 
				g.drawString("pilots at Mos Eisley Spaceport, which also abounds with all sorts of scums and criminals. ",8,545);
			}
			else if(sequence == 6)
			{
				g.setColor(Color.black);
				g.fillRect(0,0,1000,562);
				g.drawImage(cantina,0,0,null);
				g.setColor(Color.black);
				g.fillRect(700,500,300,62);
				g.setColor(Color.white);
				g.drawString("Watto charges too much for a spaceship. He is more into distributing posters for the",8,520); 
				g.drawString("crimelord Jabba. Luke must avoid Imperial troopers and use his negotiation skills with Han.",8,545);
			}
			else if (sequence == 7)
			{
				g.setColor(Color.black);
				g.fillRect(0,0,1000,562);
				g.drawImage(level2background,0,0,null);
				
				g.setColor(Color.black);
				g.drawString("Level: " + screen, 5, 25);
				watto.drawMe(g, wattoDirection);
				for (int i = 0; i < 4;i++)
				{
					myItems.get(i).drawMe(g,i);
					myItems.get(i).checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());
					if (i < 3)
					{
						myItems.get(i).taken();
					}
				}
				
				hutt.drawMe(g, hanWillFly);
				
				han.drawMe(g,level2Completed);
				luke.drawMe(g, facingRight, level2Completed);
				stormtroopers.drawMe(g, false);
				g.drawImage(falcon,3,430,null);
				g.setColor(Color.white);
				g.setFont(font);
				g.drawString("Inventory", 850, 25);
				
			}
		}
		else if (screen == 3) //level 3
		{
				if(sequence == 8)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(yavin,0,0,null);
					g.setColor(Color.black);
					g.fillRect(700,500,300,62);
					g.setColor(Color.white);
					g.drawString("Luke joins the Rebel Alliance to fight against the evil Galactic Empire. He will pilot an X-Wing ",8,520);
					g.drawString("to provide space superiority for other Rebel forces",8,545);
				}
				else if (sequence == 9)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(yavin2,0,0,null);
					g.setColor(Color.black);
					g.fillRect(700,500,300,62);
					g.setColor(Color.white);
					g.drawString("Rebel base will be Death Star's firing range in 15 minutes. Luke and his comrades are trying to ",8,520);
					g.drawString("reach the core of the Death Star. Acquire the stealth pod to disrupt enemy radars.",8,545);
				}
				else if (sequence == 10)
				{
					
					if (level == 1)
					{
						
						
						
						
						g.drawImage(Level1, 0, 0, null);
						
						for (Enemy each : enemy)
						{
							each.drawMe(g);
						}
						//d.drawMe(g);
						for (Background each : background)
						{
							each.drawMe(g);
						}
						
						for (Background2 each : background2)
						{
							each.drawMe(g);
						}
						g.setColor(Color.red);
						g.drawString("Level: " + screen, 5, 25);
						
						
						g.setColor(Color.black);
						myItems.get(4).drawMe(g,4);
						myItems.get(4).checkCollision(s1.getX(), s1.getY(), s1.getWidth(),s1.getHeight());
						g.fillRect(800,0,200,562);

						for (int i = 0; i < 5;i++)
						{
							if (myItems.get(4).inInventory() == false)
							{
								
								if (i < 4)
								{
									myItems.get(i).taken();	
									myItems.get(i).drawMe(g,i);
								}
							}
							else
							{
								myItems.get(i).drawMe(g,i);
							}
							

							
						}
						g.setColor(Color.white);
						g.setFont(font);
						g.drawString("Inventory", 850, 25);
						
					}
					
					
					
					

					for (Projectile each : p1)
					{
						 each.drawMe(g);
					}
					for (ProjectileEnemy each : p2)
					{
						each.drawMe(g);
					}
					
					s1.drawMe(g);
					

					
				}
				
				
		}
		else if (screen == 4)
		{
				if (sequence == 11)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(deathstardestroyed,0,0,null);
					g.setColor(Color.black);
					g.fillRect(700,500,300,62);
					g.setColor(Color.white);
					g.drawString("The Death Star has been destroyed. The Rebel Base still stands. Luke, however, cannot return",8,520);
					g.drawString("with his Rebel friends. His training with the Force must continue.",8,545);
				}
				if (sequence == 12)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(dagobahlanding,0,0,null);
					g.setColor(Color.black);
					g.fillRect(700,500,300,62);
					g.setColor(Color.white);
					g.drawString("As Ben instructed, Luke proceeds to Dagobah to learn from Yoda, a powerful Jedi Master who once",8,520);
					g.drawString("taught Ben Kenobi. ",8,545);
				}
				else if (sequence == 13)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(yodatraining,0,0,null);
					g.setColor(Color.white);
					g.drawString("The training is rigorous. Luke receives news later that his friends are in danger. He rushes to save",8,520);
					g.drawString("his friend, against Yoda's advice.",8,545);
				}
				else if (sequence == 14)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(father,0,0,null);
					g.setColor(Color.red);
					g.drawString("After knowing the truth, Luke unsuccessfully commits by throwing himself into the chasm. ",8,520);
					g.drawString("He later summons his courage to face Vader and the Emperor altogether in the final epic battle",8,545);
				}
				else if (sequence == 15)
				{
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					g.drawImage(level4background,0,0,null);
					luke.drawMe(g,facingRight, level4Completed);
					g.fillRect(800,0,200,600);
					g.setColor(Color.white);
					g.setFont(font);
					g.drawString("Inventory", 850, 25);
					g.drawString("Level: " + screen, 5, 25);
					
					for (int i = 0; i < myItems.size();i++)
					{
						if (myItems.get(5).inInventory() == false)
						{
							myItems.get(i).drawMe(g,i);
							if (i< myItems.size()-1 )
							{
								myItems.get(i).taken();
							}
						}
						else
						{
							myItems.get(i).drawMe(g,i);
						}
					}
					vader.drawMe(g, level4Completed);
					emperor.drawMe(g,level4Completed);
					for (Characters each : lightning)
					{
						each.drawMe(g,level4Completed);
						
					}
					cup.drawMe(g,applied);
					
				}
		}
		else if (screen == 5)
		{
			if (sequence == 16)
			{
						
						g.setColor(Color.black);
						g.fillRect(0,0,1000,562);
						g.drawImage(emperordying,0,0,null);
						g.fillRect(800,500,200,62);
						g.setColor(Color.white);
						g.drawString("Darth Vader is no more. Anakin Skywalker has returned and fullfilled the prophecy of the Chosen",8,520);
						g.drawString("One. He returns to save his son from the evil Emperor.",8,545);
			}
			
			else if (sequence == 17)
			{		
					g.setColor(Color.black);
					g.fillRect(0,0,1000,562);
					
					g.setColor(Color.black);
					
					
					if(animate == true)
					{
						g.setColor(Color.black);
						g.fillRect(0,0,1000,562);
						g.drawImage(mainMenuAnimate, 0, 0, null);
						g.setColor(Color.white);
						g.drawString("The Empire has collapsed. Peace and justice have been restored to the justice...",8,520);
						
					}
					else
					{
						g.setColor(Color.black);
						g.fillRect(0,0,1000,562);
						g.drawImage(endcredits,0,0,null);
						g.fillRect(800,500,200,62);
						g.setColor(Color.white);
						g.drawString("The Empire has collapsed. Peace and justice have been restored to the justice...",8,520);
					}
			}
		}
		
			
		

		

	}

	

	public void mousePressed(MouseEvent e) 
	{
		if (screen == 1)
		{
			if (e.getX()>0 && e.getY()>0)
			{
				if (sequence < 2)
				{
					sequence++;
				}
			}
		}
		else if (screen == 2)
		{
			if (e.getX()>0 && e.getY()>0)
			{
				if (sequence <7)
				{
					sequence++;
					if (sequence == 5)
					{
						
						se.binarySunset(false);
						se.lightsaberscene(false);
						se.cantina(true);
						
					}
				}
				
				
			}
		}
		else if (screen == 3)
		{
			if (e.getX()>0 && e.getY()>0)
			{
				if (sequence < 10)
				{
					sequence++;
					
				}
				if (sequence == 10)
				{
					level = 1;
				}
				
			}
		}
		else if (screen == 4)
		{
			if (e.getX()>0 && e.getY()>0)
			{
				if (sequence < 15)
				{
					sequence++;
					if (sequence == 14)
					{
						
						se.yavin(false);
						se.iamyourfather(true);
						
					}
					
				}
				if (sequence == 15)
					{
						se.iamyourfather(false);
						se.imperialmarch(true);
						se.lightning(true);
					}
				
			}
		}
		else if (screen == 5)
		{
			if (e.getX()>0 && e.getY()>0)
			{
				if (sequence < 17)
				{
					sequence++;
					
				}
				if (sequence == 17)
					{
						
						se.emperordying(false);
						se.endcredits(true);
					}
					
				
			}
		}
		
	}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mouseClicked(MouseEvent e){}
	
	
	public void keyPressed(KeyEvent e) {

		if (sequence == 2 && screen == 1 && (tusken1.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()) || tusken2.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight())))
		{
			se.laughing(true);				
		}
			
		if (screen == 1 && ben.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
		{
			se.foodplease(true);
		}
		
		if (screen == 2 && hutt.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
		{
			se.jabba(true);
		}
		
		if (screen == 2 && stormtroopers.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
		{
			se.stormtroopers(true);
		}
		if (screen == 1 && level1Completed)
		{
			removeAll();
			add(level2);
		}
		
		if (screen == 2 && level2Completed)
		{
			removeAll();
			add(level3);			
		}
		if (screen == 2 && stormtroopers.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
		{
			removeAll();
			add(gameOver);
			
		}
		
		/*if (screen == 3 && level == 1 && sequence == 10 && level3Completed == false && collided == true)
		{
			se.shipex
		}*/
		
		if (screen == 3 && level == 1 && sequence == 10 && level3Completed == true)
		{
			removeAll();
			add(level4);
		}
		
		if (screen == 4 && collisionlightning == true)
		{
			removeAll();
			add(gameOver);
		}

		if (screen == 4 && level4Completed)
		{
			removeAll();
			add(endGame);
		}
		

		if (e.getKeyCode()==87)
		{
			direction = 3;
		
		}
		else if (e.getKeyCode()==83)
		{
			direction = 1;
		}
		else if (e.getKeyCode()==65)
		{
			direction = 2;
			facingRight = false;
		}
		else if (e.getKeyCode()==68)
		{
			direction= 0;
			facingRight = true;
		}
		else if (e.getKeyCode()==80)
		{

			screen++;
			
			if (screen == 1)
			{
				sequence=0;
				removeAll();
				se.mainMenu(false);
				se.binarySunset(true);
				
			}
			else if (screen == 2)
			{
				sequence = 3;
				removeAll();
				tusken1.disappear();
				tusken2.disappear();
				luke.changeLocation(750, 500);	
				ben.disappear();
				se.lightsaberscene(true);
				
			}
			else if (screen == 3)
			{
				removeAll();
				sequence = 8;
				han.disappear();
				luke.disappear();
				stormtroopers.disappear();
				watto.disappear();
				se.cantina(false);	
				se.lightsaberscene(false);
				se.binarySunset(false);
				se.yavin(true);
			}
			
			 else if (screen == 4)
			{
				removeAll();
				sequence = 11;
				direction = -1;
				s1.disappear();
				for (Enemy each : enemy)
				{
					each.disappear();
				}
				
				for (Background each : background)
				{
					each.disappear();
				}
				
				for (Background2 each : background2)
				{
					each.disappear();
				}
				luke.makeVisible();
				luke.changeLocation(10, 500);	
			}
			else if (screen == 5)
			{
				sequence = 16;
				se.yavin(false);
				se.laxative(false);
				se.imperialmarch(false);
				se.emperordying(true);
				luke.disappear();
			}
		}
		if (e.getKeyCode()==71)
		{
			if (screen == 2)
			{
				if (sequence == 7)
				{
					if (hutt.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
					{
						watto.distributed();
						myItems.get(3).taken();
					}
					
				}
			}
		}
		
		if (e.getKeyCode()==38)
        {
			shipdirection = 1; 
			
               
        }
        else if (e.getKeyCode()==40)
        {
            shipdirection = 2;;  		
						
        }
		else if (e.getKeyCode()==39)
        {
            shipdirection = 3;;  		
						
        }
		else if (e.getKeyCode()==37)
        {
            shipdirection = 4;  		
						
        }
		else if( e.getKeyCode() == 32 ) //Space bar
        {
			if (screen == 3 && sequence == 10)
			{
				if (p1[firedalready].getVisible() == false)
				{
					p1[firedalready].setY( s1.getY() );
					p1[firedalready].setX( s1.getX() );
					 se.PhotonGun(true);
					  p1[firedalready].setVisible(true);
				}
				firedalready++;
				if (firedalready == p1.length - 1)
				{
					
					firedalready = 0; 
				}
			}
			
           
        }
		else if (e.getKeyCode() == 71)
		{
			if (screen == 4 && sequence == 15)
			{
				if(cup.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()) && myItems.get(5).inInventory())
				{
					for (Characters each : lightning)
					{
						each.disappear();
					}
					applied = true;
					se.laxative(true);
					se.lightning(false);
				}
			}
		}
		
		

 
    }
 
    public void keyReleased(KeyEvent e) {
			
		
	}
	
    public void keyTyped(KeyEvent e) {
		
		

	}


	public void animate()
	{

		while(true)
		{
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			counter1++;
			if(counter1%699 ==0)
			{
				animate = false;
				change = true;
			}
			
			if(counter1%899 ==0)
			{
				animate = true;
				change = false;
			}

			if(counter1%999 ==0)
			{
				animate = false;
				change = false;
			}
			
			if (level1Completed == false && screen == 1 && sequence == 2) //movements for level 1
			{
				luke.move(direction);
				tusken1.move();
				tusken2.move();
				
				ben.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());	
				if (tusken1.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
				{
				raided = true;
				level1Completed = false;
				for (Items each : myItems)
					{
						each.makeVisible();
					}
				
				}
				else
				{
					raided = false;
					if (myItems.get(0).inInventory() == true && myItems.get(1).inInventory() == true && ben.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
					{
						level1Completed = true;
					}
				}
			}		
			
			if (sequence == 7 && level2Completed == false && screen == 2 && !stormtroopers.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight())) //movements for level2
			{
				myItems.get(3).changeLocation(watto.getX(),watto.getY(),watto.leftorright(), luke.getLevel());
				luke.move(direction);
				hutt.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());	
				han.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());	
				luke.checkCollision(han.getX(),han.getY(),han.getWidth(),han.getHeight());
				
				wattoDirection = watto.move();
				if (myItems.get(3).inInventory() == true && han.knowsHan())
				{
					hanWillFly = true;
				}
				if (myItems.get(3).inInventory() == true && han.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()) && hanWillFly)
				{
					level2Completed = true;
				}
			}
			
			
			
			if (level == 1 && collided != true && sequence == 10 && level3Completed == false) //actually level 3
			{
				time++;
				for (Enemy each : enemy)
				{
					each.move();
					getshot = each.checkCollision(p1, se);
					xalien = each.getX();
					crashornot = each.checkCollisionShip(s1, xalien);
					if(crashornot || s1.checkCollision(p2, se))
					{
						collided = true;
					}
							
				}
				//myItems.get(3).changeLocation(background2[0].getX(),background2[0].getY(), false);
				myItems.get(4).changeLocation(background[0].getX(),background[0].getY(), false, luke.getLevel());
				

				for (int i = 0; i < enemy.length; i++)
				{
					if(time%200 == 0 ||time%555 == 0)
					{
		
						if (p2[firedalreadyenemy].getVisible() == false && enemy[i].getVisible() == true)
							{
								p2[firedalreadyenemy].setY( enemy[i].getY() );
								p2[firedalreadyenemy].setX( enemy[i].getX() );
								 se.PhotonGun(true);
								  p2[firedalreadyenemy].setVisible(true);
							}

						

						firedalreadyenemy++;
						if (firedalreadyenemy == p2.length - 1)
						{
							firedalreadyenemy = 0; 
						}
						
						
					}
				}
				s1.drawCollision(collided); 	
				if (collided == true)
				{
					
					add(gameOver);
				}
				for (Background each : background)
				{
					each.move();
				}
				
				for (Background2 each : background2)
				{
					each.move();
				}
				
				
				
				 
				s1.move(shipdirection);
				
				if (myItems.get(4).inInventory() == true && enemy[0].getVisible() == false && enemy[1].getVisible() == false && enemy[2].getVisible() == false && enemy[3].getVisible() == false && enemy[4].getVisible() == false && enemy[5].getVisible() == false)
				{
					level3Completed = true;
				}
				
				
				
				for (Projectile each : p1)
				{
					 each.moveRight();
				}
				for (ProjectileEnemy each : p2)
				{
					 each.moveLeft();
				}
		

				for (int i = 0; i < p1.length; i++)
				{
					if (p1[firedalready].getVisible() == true)
					{
						p1[firedalready].setY( s1.getY() );
						p1[firedalready].setX( s1.getX() );
						 
					}
				}
				for (int i = 0; i < p2.length; i++)
				{
					for (int j = 0; j < enemy.length; j++)
					{
						if (p2[firedalreadyenemy].getVisible() == true)
						{
							p2[firedalreadyenemy].setY( enemy[j].getY() );
							p2[firedalreadyenemy].setX( enemy[j].getX() );
							 
						}
					}
					
				}

				
				
		
			}
					
			
		
			if (level4Completed == false && screen == 4 && sequence == 15 && collisionlightning == false) //movements for level 4
			{
				luke.move(direction);
				
				for (Characters each : lightning)
				{
					if (each.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight()))
					{
						collisionlightning = true;
					}
				}
				myItems.get(5).checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());
				cup.checkCollision(luke.getX(),luke.getY(),luke.getWidth(),luke.getHeight());
				if(luke.checkCollision(vader.getX(), vader.getY(), vader.getWidth(), vader.getHeight()))
				{
					level4Completed = true;
				}
				
			}
			

			
			
			
	
			
			
			
			luke.level = screen;
			
			
			
			
			
			
			
			
			
	
			

			
			
			

			repaint();
			
		}
	}
	
	 public void actionPerformed(ActionEvent e)
    {
		
        
		
		 if( e.getSource() == start)
        {
			removeAll();
			screen = 1;
			se.mainMenu(false);
			se.binarySunset(true);
			
        }
		else if (e.getSource() == level2)
		{
			removeAll();
			screen = 2;
			sequence = 3;		
			se.lightsaberscene(true);
			tusken1.disappear();
			tusken2.disappear();
			ben.disappear();
			direction = -1;
			luke.changeLocation(750, 500);	
			
		}
		else if (e.getSource() == gameOver)
		{
			if (screen == 2)
			{
				luke.changeLocation(750, 500);			
				sequence = 7;
				level2Completed = false;
				wattoCounter = 0;
				wattoDirection = false;
				hanWillFly = false;
				direction = -1;
				myItems.get(3).makeVisible();
				removeAll();
			}
			if (screen == 3)
			{
				collided = false;
				se.cantina(false);
				se.yavin(true);
				screen = 3;
				sequence = 10;
				level = 1;				
				direction = -1;
				myItems.get(4).makeVisible();
				shipdirection = 0;
				firedalreadyenemy = 0;
				s1.reset();
				destroyercollision = false;
				level3Completed = false;
				
				for (Enemy each : enemy)
				{
					each.reset();
				}
				for (Projectile each : p1)
				{
					each.reset();
				}
				for (ProjectileEnemy each : p2)
				{
					each.reset();
				}
				removeAll();

				
					
			}
			if (screen == 4)
			{
				
				screen = 4;
				sequence = 15;
				direction = -1;
				collisionlightning = false;
				luke.makeVisible();
				luke.changeLocation(20, 500);	
				cup.reset();
				myItems.get(5).makeVisible();
				se.lightning(true);
				removeAll();
			}
		}
		else if (e.getSource() == level3)
		{
			se.cantina(false);
			se.yavin(true);
			removeAll();
			screen = 3;
			sequence = 8;
			han.disappear();
			luke.disappear();
			stormtroopers.disappear();
			direction = -1;
			watto.disappear();
		}
	    else if (e.getSource() == level4)
		{
			removeAll();
			screen = 4;
			sequence = 11;
			direction = -1;
			s1.disappear();
			for (Enemy each : enemy)
			{
				each.disappear();
			}
			
			for (Background each : background)
			{
				each.disappear();
			}
			
			for (Background2 each : background2)
			{
				each.disappear();
			}
			luke.makeVisible();
			luke.changeLocation(20, 500);	
		}
		else if (e.getSource() == endGame)
		{
			removeAll();
			screen = 5;
			sequence = 16;
			se.yavin(false);
			se.laxative(false);
			se.imperialmarch(false);
			se.emperordying(true);
			luke.disappear();
		}
		

		
 
    }
    
	
}
