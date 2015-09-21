package CSULBLMAP;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Frame extends JFrame{
	
	
	private Map map;
	private JScrollPane mapScreen;
	private UserInterface UI;
	
	public Frame(String title,BufferedImage background){
		
		setLayout(new BorderLayout());
		
		map = new Map(background);
		mapScreen = new JScrollPane(map);
		
		UI = new UserInterface(map,this.getHeight()/3,this.getWidth());
		//UserInterface.init();
		//UserInterface UI = UserInterface.getInstance();
		
		//Initialized Card
		
		this.add(mapScreen,BorderLayout.CENTER);
		this.add(UI,BorderLayout.PAGE_END);
		//this.setPreferredSize(new Dimension(background.getHeight(),background.getWidth()));
		this.setBounds(100, 100, this.getWidth(), this.getHeight());
		
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(0,0,background.getHeight(),background.getHeight());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		//this.setContentPane(new JLabel(new ImageIcon(background)));
		
	}
	
	public void loadCards(Cards cards){
		UI.loadCard(cards);
	}

}
