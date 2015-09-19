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
	private static Map m = new Map();
	
	/**
	 * Contructor - initialize instance of map,
	 * 			  - initialize scroll bar
	 * @param img Image of the background/map of the game
	 */
	private Map(){
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
			g.drawImage(a,0,0,this);
	}
	
	/**
	 * Method for returning a singleton instance of Map
	 * @return Instance of Map
	 */
	public static Map getInstance(){
		return m;
	}
	
	/**
	 * Set background image of this panel
	 * set Prefered size so that it anable scroll bar
	 * @param image
	 */
	public void setMap(BufferedImage image){
		a = image;
		m.setPreferredSize
		(new Dimension(a.getHeight(),a.getWidth()));
	}
	
	/**
	 * Check the current state of the class
	 * @return
	 */
	public static boolean isNull(){
		return m == null;
	}
}
