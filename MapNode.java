package CSULBMAP;

import java.io.*;
import java.util.Scanner;

public class MapNode {
	public String currentLocation;
	public class Node extends MapNode{
		public int[] possibleRooms;
		public String fileName="mapNode.txt";
		public int counter;
		public void getRooms() throws FileNotFoundException{
		
			File file=new File(fileName);
			Scanner input =new Scanner(file);
			input.close();
			//looks for room
			if(input.hasNext(currentLocation)){
				//count number of elements in array
				
			}
		}
	}
					
		
		
} 
