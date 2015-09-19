package CSULBLMAP;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Frame extends JFrame{
	
	public Frame(String title,BufferedImage background){
		
		
		
		setLayout(new BorderLayout());
		
		Map map = new Map(background);
		JScrollPane mapScreen = new JScrollPane(map);
		
		UserInterface UI = new UserInterface(this.getHeight()/4,this.getWidth());
		
		//UserInterface.init();
		//UserInterface UI = UserInterface.getInstance();
		
		this.add(mapScreen,BorderLayout.CENTER);
		this.add(UI,BorderLayout.PAGE_END);
		
		
		
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
