package CSULBLMAP;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Map extends JPanel{

	private BufferedImage a;
	private JScrollBar hbar,vbar;
	public Map(BufferedImage img){
		a = img;
		hbar = new JScrollBar();
		vbar = new JScrollBar();
		this.setPreferredSize(new Dimension(img.getHeight(),img.getWidth()));
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
			g.drawImage(a,0,0,this);
	}
}
