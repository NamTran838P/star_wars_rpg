import java.net.URL;
import java.io.*;
import javax.sound.sampled.*;


public class SoundEffects 
{
	private Clip clip;
	private Clip mainMenu;
	private Clip cantina;
	private Clip laughing;
	private Clip lightsaberscene;
	private Clip foodplease;
	private Clip binary;
	private Clip jabba;
	private Clip stormtroopers;
	private Clip yavin;
	private Clip PhotonGun;
	private Clip ShipExplosion;
	private Clip EnemyExplosion;
	private Clip iamyourfather;
	private Clip imperialmarch;
	private Clip endcredits;
	private Clip enemyexplosion;
	//private Clip shipexplosion;
	private Clip laxative;
	private Clip lightning;
	private Clip emperordying;
 
	public SoundEffects()
    {

		try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/mainMenu.wav");
            mainMenu = AudioSystem.getClip();
            mainMenu.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/lightning.wav");
            lightning = AudioSystem.getClip();
            lightning.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/laxative.wav");
            laxative = AudioSystem.getClip();
            laxative.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/yavin.wav");
            yavin = AudioSystem.getClip();
            yavin.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/endcredits.wav");
            endcredits = AudioSystem.getClip();
            endcredits.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/enemyexplosion.wav");
            enemyexplosion = AudioSystem.getClip();
            enemyexplosion.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 /*try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/shipexplosion.wav");
            shipexplosion = AudioSystem.getClip();
            shipexplosion.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }*/
		 
		
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/laughing.wav");
            laughing = AudioSystem.getClip();
            laughing.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/foodplease.wav");
            foodplease = AudioSystem.getClip();
            foodplease.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/lightsaberscene.wav");
            lightsaberscene = AudioSystem.getClip();
            lightsaberscene.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/cantina.wav");
            cantina = AudioSystem.getClip();
            cantina.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/iamyourfather.wav");
            iamyourfather = AudioSystem.getClip();
            iamyourfather.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/imperialmarch.wav");
            imperialmarch = AudioSystem.getClip();
            imperialmarch.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/jabba.wav");
            jabba = AudioSystem.getClip();
            jabba.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/stormtroopers.wav");
            stormtroopers = AudioSystem.getClip();
			stormtroopers.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/emperordying.wav");
            emperordying = AudioSystem.getClip();
			emperordying.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		 
		 try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/binarySunset.wav");
            binary = AudioSystem.getClip();
			binary.open(AudioSystem.getAudioInputStream(url));		
			
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
		
			 
		
       
    }
 
    public void mainMenu(boolean sound)
    {
		if (sound == false) 
		{
			mainMenu.stop();
			mainMenu.close();
		}
		else
		{
			mainMenu.start();
			mainMenu.loop(clip.LOOP_CONTINUOUSLY);
		}
			
			 
		
       
    }
	
	    public void binarySunset(boolean sound)
    {
		if (sound == false) 
		{
			binary.stop();
			binary.close();
		}
		else
		{
			binary.start();
			binary.loop(clip.LOOP_CONTINUOUSLY);
		}
			 
        
    }
	
	 public void iamyourfather(boolean sound)
    {
		if (sound == false) 
		{
			iamyourfather.stop();
			iamyourfather.close();
		}
		else
		{
			iamyourfather.start();
			
         }

			 
        
    }
	
	 public void imperialmarch(boolean sound)
    {
		if (sound == false) 
		{
			imperialmarch.stop();
			imperialmarch.close();
		}
		else
		{
			
			imperialmarch.start();
			imperialmarch.loop(clip.LOOP_CONTINUOUSLY);
				
			
         }
       
			 
        
    }
	
	public void jabba(boolean sound)
    {
		if (sound == false) 
		{
			jabba.stop();
			jabba.close();
		}
		else
		{

			jabba.start();
			
				
			
         }
        
			 
        
    }
	
	public void stormtroopers(boolean sound)
    {
		if (sound == false) 
		{
			stormtroopers.stop();
			stormtroopers.close();
		}
		else
		{
			
			stormtroopers.start();
			
				
			
         }
       
        
    }
	
	public void yavin(boolean sound)
    {
		if (sound == false) 
		{
			yavin.stop();
			yavin.close();
		}
		else
		{
			
			yavin.start();
			yavin.loop(clip.LOOP_CONTINUOUSLY);
				
			
         }
         
			 
        
    }
	
	public void laxative(boolean sound)
	{
		if (sound == false) 
		{
			laxative.stop();
			laxative.close();
		}
		else
		{
			
			laxative.start();
			laxative.loop(clip.LOOP_CONTINUOUSLY);
				
			
         }
	}
	
	  public void cantina(boolean sound)
    {
		if (sound == false) 
		{
			cantina.stop();
			cantina.close();
		}
		else
		{
			
			cantina.start();
			cantina.loop(clip.LOOP_CONTINUOUSLY);

         }
         
			 
        
    }
	
	
	
	public void lightsaberscene(boolean sound)
    {
         if (sound == false) 
		{
			lightsaberscene.stop();
			lightsaberscene.close();
		}
		else
		{
			
			lightsaberscene.start();
			lightsaberscene.loop(clip.LOOP_CONTINUOUSLY);
				
			
         }
        
        
    }
	
	public void foodplease(boolean sound)
    {
         if (sound == false) 
		{
			foodplease.stop();
			foodplease.close();
		}
		else
		{
			
			foodplease.start();

         }
        
        
    }
	
	public void laughing(boolean sound)
    {
         if (sound == false) 
		{
			laughing.stop();
			laughing.close();
		}
		else
		{
			try
         {
            URL url = this.getClass().getClassLoader().getResource("sound/laughing.wav");
            laughing = AudioSystem.getClip();
            laughing.open(AudioSystem.getAudioInputStream(url));		
			laughing.start();
         }
         catch (Exception exc)
         {
             exc.printStackTrace(System.out);	 
         }
			
			
         }
        
        
    }
	
	 public void PhotonGun(boolean sound)
    {
          
        if (sound == false) 
		{
			PhotonGun.stop();
			PhotonGun.close();
		}
		else
		{
			 try
			 {
				URL url = this.getClass().getClassLoader().getResource("sound/Photon Gun.wav");
				PhotonGun = AudioSystem.getClip();
				PhotonGun.open(AudioSystem.getAudioInputStream(url));		
				PhotonGun.start();		
			 }
			 catch (Exception exc)
			 {
				 exc.printStackTrace(System.out);	 
			 }
						
			
        }
    }
	
	/*public void ShipExplosion(boolean sound)
    {
		if (sound == false) 
		{
			shipexplosion.stop();
			shipexplosion.close();
		}
		else
		{
			shipexplosion.start();				
			
        }
    }*/
	
	public void EnemyExplosion(boolean sound)
    {
          
        if (sound == false) 
		{
			enemyexplosion.stop();
			enemyexplosion.close();
		}
		else
		{
			enemyexplosion.start();				
			
        }
    }
	public void endcredits(boolean sound)
    {
		if (sound == false) 
		{
			endcredits.stop();
			endcredits.close();
		}
		else
		{
			
			endcredits.start();
			endcredits.loop(clip.LOOP_CONTINUOUSLY);
			
				
			
        }
         
		
			 
		
       
    }
	public void lightning(boolean sound)
    {
		if (sound == false) 
		{
			lightning.stop();
			lightning.close();
		}
		else
		{
			
			lightning.start();
			lightning.loop(clip.LOOP_CONTINUOUSLY);
			
				
			
        }
         
		
			 
		
       
    }
	
	public void emperordying(boolean sound)
    {
		if (sound == false) 
		{
			emperordying.stop();
			emperordying.close();
		}
		else
		{
			
			emperordying.start();
			emperordying.loop(clip.LOOP_CONTINUOUSLY);
			
				
			
        }
         
		
			 
		
       
    }
	
     

     
}