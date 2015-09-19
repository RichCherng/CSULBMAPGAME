package CSULBLMAP;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * Singleton Class for user interface
 * @author Pongsathorn Cherngchaosil
 *
 */
public class UserInterface extends JPanel {

	private WestPanel westPanel;
	//, centerPanel,
	//eastPanel;
	
	public UserInterface(int height, int width){
		this.setLayout(new SpringLayout());
		westPanel = new WestPanel();
		this.add(westPanel);
		//this.setPreferredSize(new Dimension(height,width));
		this.setPreferredSize(new Dimension(100,100));
		
		
	}
	
}
