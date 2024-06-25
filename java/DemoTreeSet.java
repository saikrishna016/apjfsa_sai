package anudip.java;

import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {
		//Initializing Objects
		TreeSet<String> t=new TreeSet<String>();
		
		//Adding Elements to the Set
		t.add("India");
		t.add("USA");
		t.add("UK");
		t.add("Pakistan");
		
		//Printing set Elements
		System.out.println(t);
		
		//Printing first Element from the Set
		System.out.println(t.first());
		
		//Printing Size of the Set
		System.out.println(t.size());
		
		//removing an element from the set
		System.out.println(t.remove("UK"));
		System.out.println(t);
		
		// Add a new element to the set
		t.add("Russia");
		
		//Printing the set elements
		System.out.println(t);
		
		//Printing the elements in reverse order
		System.out.println(t.descendingSet());
	}
}