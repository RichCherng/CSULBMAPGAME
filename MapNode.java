package CSULBMAP;

import java.io.*;
import java.util.Scanner;

public class MapNode {
	
	Node[] mNode = new Node[21];
	
	public MapNode(){
		Node zero = new Node("George Allen Field",0,{1,3,5});
		
		mNode[zero.MID] = zero;
		
		Node one = new Node("Japanese Gardemn", 1,{0,3,2});
		mNode[one.MID]=one;
		
		Node two=new Node ("Student Parking", 2, {1,3,5,6});
		mNode[two.MID]=two;
		
		Node three = new Node ("Pyramid", 3,{0,2,3,4,6});
		mNode[three.MID]=three;
		
		Node four=new Node("West Walkway", 4, {5,7,12});
		mNode[four.MID]=four;
		
		Node five = new Node("Rec Center",5, {0,3,4,6});
		mNode[five.MID]=five;
		
		Node six=new Node{"Forbiden Parking", 6, {2,5,10});
		mNode[six.MID] = six;
		
		Node seven=new Node{"Library", 7,{4,8});
		mNode[seven.MID]=seven;
		
		Node eight=new Node{"LA 5",8,{7,9});
		mNode[eight.MID]=eight;
		
		Node nine=new Node("Bratwurst",9,{8,10});
		mNode[nine.MID]=nine;
		
		Node ten=new Node("East WlakWay",10,{9,6,15});
		mNode[ten.MID]=ten;
		
		Node eleven=new Node("Computer Lab",11,{12});
		mNode[eleven.MID]=eleven;
		
		Node twelve=new Node("North Hall",12,{11,13,14,15,16});
		mNode[twelve.MID]=twelve;
		
		Node thirteen=new Node("Room of Retirement",13,{12});
		mNode[thirteen.MID]=thirteen;
		
		Node fourteen=new Node("CECS 302",14,{12,15});
		mNode[fourteen.MID]=fourteen;
		
		mNode fifteen=new Node("South Hall",15,{14,17,18,19,20});
		mNode[fifteen.MID]=fifteen;
		
		mNode sixteen=new Node("Elevators",16,{8,12});
		mNode[sixteen.MID]=sixteen;
		
		mNode seventeen=new Node("ECS 308",17,{15});
		mNode[seventeen.MID]=seventeen;
		
		mNode eighteen=new Node("Eat Club",18,{15});
		mNode[eighteen.MID]=eighteen;
		
		mNode nineteen=new Node("CECS COnference Room",19,{15});
		mNode[nineteen.MID]=nineteen;
		
		mNode twenty=new Node("Lactation Room",20,{15});
		mNode[twenty.MID]=twenty;
		}
		}
		}
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
