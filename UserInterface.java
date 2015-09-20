package CSULBLMAP;

import java.awt.BorderLayout;
import java.awt.Dimension;

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
		this.setLayout(new BorderLayout());
		
		westPanel = new WestPanel();
		this.add(westPanel,BorderLayout.LINE_START);
		
		centerPanel = new CenterPanel();
		this.add(centerPanel,BorderLayout.CENTER);
		
		
		//this.setPreferredSize(new Dimension(height,width));
		this.setPreferredSize(new Dimension(300,300));
		
		
	}
	
	public void loadCard(Cards cards){
		centerPanel.loadCard(cards);
		centerPanel.repaint();
	}
	
}  