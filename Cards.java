package CSULBLMAP;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Cards {

	public ArrayList<BufferedImage> cards = new ArrayList<BufferedImage>();
	
	public Cards(){
		
		//Read everythign in the directory
		File file = new File("src/CSULBLMAP/Resources/Cards/");
		
		File[] files = file.listFiles();
		
		for(int i = 0; i < files.length; i++){
			System.out.println("Reading " + files[i]);
			//Reading content
			
			try {
				cards.add(ImageIO.read(files[i]));
				
			} catch (Exception e){
				System.out.println("Failed to load card images...");
			}
		}
		
		
		
	}
}
