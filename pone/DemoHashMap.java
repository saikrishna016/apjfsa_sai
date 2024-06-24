package pone;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		
HashMap<Integer,String> cities = new HashMap<Integer,String>();
		
		cities.put(1, "Indore");
		cities.put(2, "Surat");
		cities.put(3, "Mumbai");
		cities.put(4, "Bhopal");
		cities.put(5, "Visakapatnam");		
		cities.put(4,  "Mysore");
	    System.out.println(cities);
	    
	    cities.putIfAbsent(5,"Tirupathi");
	  System.out.println(cities.entrySet(4));
	  
	    System.out.println(cities.keySet());
	    System.out.println(cities.values());
	    System.out.println(cities.remove(5));
	    System.out.println(cities);
	    
	    
	    
	}



	}


