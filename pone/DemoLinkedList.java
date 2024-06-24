package pone;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
	
	public static void main(String []args) {
		List<Double> llist= new LinkedList<Double>();
		
		llist.add(2000.03);
		llist.add(3005.35);
		llist.add(3200.03);
		llist.add(3205.35);
		llist.add(321.03);
		llist.add(302.35);
		
		System.out.println(llist);
		System.out.println(llist.size());
		
		llist.remove(0);
		System.out.println(llist);
		//llist.push(4302.32);
		
	}

}
