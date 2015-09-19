package CSULBLMAP;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WestPanel extends JPanel implements ActionListener {

	private JButton draw, move, play;
	private String tool_draw, tool_move, tool_play;

	public WestPanel() {

		this.setLayout(new GridLayout(0,1));

		
		tool_draw = "Draw a card from the deck";
		tool_move = "Once location is selected, character will move and end turn";
		tool_play = "Play the current card";
		
		draw = new JButton("Draw Card");
		// draw.setVerticalTextPosition(AbstractButton.CENTER);
		// draw.setHorizontalTextPosition(AbstractButton.LEADING);
		// draw.setMnemonic(KeyEvent.VK_D);
		// draw.setActionCommand("disable");
		draw.addActionListener(this);
		draw.setToolTipText(tool_draw);
		this.add(draw);

		move = new JButton("Move");
		move.addActionListener(this);
		move.setToolTipText(tool_move);
		this.add(move);

		play = new JButton("Play Card");
		play.addActionListener(this);
		play.setToolTipText(tool_play);
		this.add(play);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
