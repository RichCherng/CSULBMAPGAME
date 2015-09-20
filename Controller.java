package CSULBLMAP;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Controller implements Runnable {


	private Frame frame;
	public Controller(String title) {
		
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/CSULBLMAP/Resources/CSULBMap3.png"));
		} catch (IOException e) {
			
		}
		frame = new Frame("CSULB",img);
		frame.loadCards(new Cards());

		
	}

	@Override
	public void run() {

		while (true) {
			update();
			// if (!player.inGame())
			// break;
			try {
				Thread.sleep(50);// ~60 fps
			} catch (InterruptedException e) {

			}
		}
	}
	
	public void update(){
		
	}

}
