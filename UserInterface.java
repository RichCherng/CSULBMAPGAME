package CSULBLMAP;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * Singleton Class for user interface
 * @author Pongsathorn Cherngchaosil
 *
 */
public class UserInterface extends JPanel implements ActionListener {

	private WestPanel westPanel;
	private CenterPanel centerPanel;
	private String tool_draw, tool_move, tool_play;
	private JButton draw, move, play;
	private JList locationList;
	//, centerPanel,
	//eastPanel;
	
	public UserInterface(Map m,int height, int width){
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = .5;
		c.weighty = .5;
		c.gridx = 0;
		c.gridy = 0;
		draw = new JButton("Draw Card");
		draw.addActionListener(this);
		draw.setToolTipText(tool_draw);
		this.add(draw,c);
		
		c.gridy = 1;
		move = new JButton("Move");
		move.addActionListener(this);
		move.setToolTipText(tool_move);
		this.add(move,c);
		
		c.gridy = 2;
		play = new JButton("Play Card");
		play.addActionListener(this);
		play.setToolTipText(tool_play);
		this.add(play,c);
		
		c.gridx = 1;
		c.gridy = 0;
		centerPanel = new CenterPanel();
		centerPanel.setPreferredSize(new Dimension(200,270));
		this.add(centerPanel,c);
		
		c.gridx = 0;
		c.gridy = 3;
		locationList = new JList(/* map node here*/);
		locationList.setLayoutOrientation(JList.VERTICAL);
		locationList.setPreferredSize(new Dimension(200,100));
		this.add(locationList,c);
		//this.setPreferredSize(new Dimension(height,width));
		this.setPreferredSize(new Dimension(300,300));
		
		
	}
	
	public void loadCard(Cards cards){
		centerPanel.loadCard(cards);
		centerPanel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}  