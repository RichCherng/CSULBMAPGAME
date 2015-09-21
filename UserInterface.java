package CSULBLMAP;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

/**
 * Singleton Class for user interface
 * @author Pongsathorn Cherngchaosil
 *
 */
public class UserInterface extends JPanel {

	private WestPanel westPanel;
	private CenterPanel centerPanel;
	//, centerPanel,
	//eastPanel;
	
	public UserInterface(Map m,int height, int width){
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = .5;
		c.weighty = .5;
		c.gridx = 0;
		c.gridy = 0;
		westPanel = new WestPanel();
		this.add(westPanel,c);
		
		c.gridx = 1;
		c.gridy = 0;
		centerPanel = new CenterPanel();
		centerPanel.setPreferredSize(new Dimension(200,270));
		this.add(centerPanel,c);
		
		
		//this.setPreferredSize(new Dimension(height,width));
		this.setPreferredSize(new Dimension(300,300));
		
		
	}
	
	public void loadCard(Cards cards){
		centerPanel.loadCard(cards);
		centerPanel.repaint();
	}
	
}  