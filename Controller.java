package CSULBLMAP;

import java.awt.image.BufferedImage;

public class Controller implements Runnable {


	public Controller(String title, BufferedImage background) {
		new Frame("CSULB",background);
		
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
