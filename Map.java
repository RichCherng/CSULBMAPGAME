package CSULBLMAP;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
/**
 * Singleton class map
 * @author Pongsathorn Cherngchaosil
 *
 */
public class Map extends JPanel{

	private static BufferedImage a;
	//private JScrollBar hbar = new JScrollBar();
	//private JScrollBar vbar = new JScrollBar();
	
	/**
	 * Contructor - initialize instance of map,
	 * 			  - initialize scroll bar
	 * @param img Image of the background/map of the game
	 */
	public Map(BufferedImage image){
		a = image;
		this.setPreferredSize(new Dimension(a.getHeight(),a.getWidth()));
	}
	
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
			g.drawImage(a,0,0,this);
	}
	
}
