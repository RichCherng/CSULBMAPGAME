package CSULBLMAP;


import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Frame extends JFrame{
	
	public Frame(String title,BufferedImage background){
		
		
		
		setLayout(new BorderLayout());
		
		Map map = Map.getInstance();
		map.setMap(background);
		JScrollPane mapScreen = new JScrollPane(map);
		
		UserInterface UI = UserInterface.getInstance();
		
		this.add(mapScreen,BorderLayout.CENTER);
		this.add(UI,BorderLayout.SOUTH);
		
		
		
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setBounds(0,0,background.getHeight(),background.getHeight());
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		//this.setContentPane(new JLabel(new ImageIcon(background)));
		
	}

}
