import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Runner { 

	public static void main(String args[])
	{
		
		JFrame frame = new JFrame("Static");
         
		Screen sc = new Screen();
		frame.add(sc);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		sc.animate();
		
	
		
	}
}	
