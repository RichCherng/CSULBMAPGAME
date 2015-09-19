package CSULBLMAP;

public class Controller implements Runnable {

	private Map map;
	private UserInterface UI;

	public Controller() {
		map = Map.getInstance();
		UI = UserInterface.getInstance();
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
