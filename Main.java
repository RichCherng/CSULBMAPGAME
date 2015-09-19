package CSULBLMAP;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/CSULBLMAP/Resources/CSULBMap3.png"));
		} catch (IOException e) {
			
		}
		new Controller();
		new Frame("CSULB",img);
	}
}
