package anudip.java;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {

HashMap<Integer,String> cities = new HashMap<Integer,String>();
		
		cities.put(1, "Indore");
		cities.put(2, "Surat");
		cities.put(3, "Mumbai");
		cities.put(4, "Bhopal");
		cities.put(5, "Visakapatnam");		
		
	    System.out.println(cities);
	    
	 //   System.out.println(cities.entrySet());
	    System.out.println(cities.keySet());
	    System.out.println(cities.values());
	    
	    
	}

}
