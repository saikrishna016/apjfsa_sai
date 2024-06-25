package anudip.java;

import java.util.ArrayDeque;

public class ArrayDemoDeque {

    // Main method to demonstrate ArrayDeque operations
		public static void main(String[] args) {
			// Create an ArrayDeque to store strings
			ArrayDeque<String> ad=new ArrayDeque<String>();
			//Adding elements to the Queue
			ad.add("Sai krishna");
			ad.add("Ajay");
			ad.add("Anvesh");
			ad.add("Dhanush");
			
			//printing queue elements
			System.out.println(ad);
			
			//printing top elements from the queue
			System.out.println(ad.peek());
			
			//deleting element from the queue
			System.out.println(ad.poll());
			System.out.println(ad);
			
			// Add new elements to the queue
			ad.add("Nagaraj");
			ad.addFirst("Rafi");  // Add element to the beginning of the queue
			ad.addLast("Vamshi");   // Add element to the end of the queue
			//printing queue elements
			System.out.println("Updated Queue :" +ad);
		}
	}

