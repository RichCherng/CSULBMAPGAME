package CSULBLMAP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class CenterPanel extends JPanel{

	ArrayList<BufferedImage> deck,discard;
	private int curCard;
	Random rand = new Random();
	public CenterPanel(){
		
	}
	
	/**
	 * Allow access to class Cards's content
	 * @param cards
	 */
	public void loadCard(Cards cards){
		//Make a copy of all total card image
		deck = new ArrayList<BufferedImage>(cards.cards);
		this.setPreferredSize(new Dimension(deck.get(0).getHeight(),
				deck.get(0).getWidth()));
		//discard deck is initially empty
		discard = new ArrayList<BufferedImage>();
		//generate random index to pick a random card
		curCard = rand.nextInt(deck.size());
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
			if(deck != null)
				g.drawImage(deck.get(curCard),0,0,this);
	}
}
