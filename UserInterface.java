package CSULBLMAP;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * Singleton Class for user interface
 * @author Pongsathorn Cherngchaosil
 *
 */
public class UserInterface extends JPanel {

	private static UserInterface UI = new UserInterface();
	private WestPanel westPanel;
	//, centerPanel,
	//eastPanel;
	
	private UserInterface(){
		UI.setLayout(new SpringLayout());
		westPanel = new WestPanel();
	}
	
	/**
	 * Method for returning a singleton instance of UserInterface
	 * @return Instance of UserInterface
	 */
	public static UserInterface getInstance(){
		return UI;
	}
}
