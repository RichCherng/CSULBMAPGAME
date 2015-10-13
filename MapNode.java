package CSULBLMAP;

import java.io.*;
import java.util.Scanner;

public class MapNode {
	
	Node[] mNode = new Node[21];
	
	public MapNode(){
		Node zero = new Node("George Allen Field",0,new int[]{1,3,5});
		Node one = new Node("Japanese Gardemn", 1,new int[]{0,3,2});
		Node two=new Node ("Student Parking", 2, new int[]{1,3,5,6});
		Node three = new Node ("Pyramid", 3,new int[]{0,2,3,4,6});
		Node four=new Node("West Walkway", 4, new int[]{5,7,12});
		Node five = new Node("Rec Center",5, new int[]{0,3,4,6});
		Node six=new Node("Forbiden Parking", 6, new int[]{2,5,10});
		Node seven=new Node("Library", 7,new int[]{4,8});
		Node eight=new Node("LA 5",8,new int[]{7,9});
		Node nine=new Node("Bratwurst",9,new int[]{8,10});
		Node ten=new Node("East WlakWay",10,new int[]{9,6,15});
		Node eleven=new Node("Computer Lab",11,new int[]{12});
		Node twelve=new Node("North Hall",12,new int[]{11,13,14,15,16});
		Node thirteen=new Node("Room of Retirement",13,new int[]{12});
		Node fourteen=new Node("CECS 302",14,new int[]{12,15});
		Node fifteen=new Node("South Hall",15,new int[]{14,17,18,19,20});
		Node sixteen=new Node("Elevators",16,new int[]{8,12});
		Node seventeen=new Node("ECS 308",17,new int[]{15});
		Node eighteen=new Node("Eat Club",18,new int[]{15});
		Node nineteen=new Node("CECS COnference Room",19,new int[]{15});
		Node twenty=new Node("Lactation Room",20,new int[]{15});
		
		mNode[zero.MID] = zero;
		mNode[one.MID]=one;
		mNode[two.MID]=two;
		mNode[three.MID]=three;
		mNode[four.MID]=four;
		mNode[five.MID]=five;
		mNode[six.MID] = six;
		mNode[seven.MID]=seven;
		mNode[eight.MID]=eight;
		mNode[nine.MID]=nine;
		mNode[ten.MID]=ten;
		mNode[eleven.MID]=eleven;
		mNode[twelve.MID]=twelve;
		mNode[thirteen.MID]=thirteen;
		mNode[fourteen.MID]=fourteen;
		mNode[fifteen.MID]=fifteen;
		mNode[sixteen.MID]=sixteen;
		mNode[seventeen.MID]=seventeen;
		mNode[eighteen.MID]=eighteen;
		mNode[nineteen.MID]=nineteen;
		mNode[twenty.MID]=twenty;
		
	}
	
	class Node{
		
		private String name;
		int MID;
		private int[] m ;
		
		public Node(String name,int id,int[] move){
			MID = id;
			m = move;
		}
		
	}
				
	
		
		
} 
