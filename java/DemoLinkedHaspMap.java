package anudip.java;

import java.util.LinkedHashMap;

public class DemoLinkedHaspMap {

	public static void main(String[] args) {

		// Create a LinkedHashMap to store country codes
		LinkedHashMap<String,Integer> countryCodes = new LinkedHashMap<String,Integer>();
		
		
		//put key values pairs into the map
		countryCodes.put("Us", 1);
		countryCodes.put("India",91);
		countryCodes.put("Russia",7);
		countryCodes.put("Australia",61);
		countryCodes.put("China",86);
		countryCodes.put("Pakisthan",92);
		countryCodes.put(null,9);
		
		//print the entire map
		System.out.println(countryCodes);
		
		// Print only the values in the map
		System.out.println(countryCodes.values());
		
		// Print only the keys in the map
		System.out.println(countryCodes.keySet());
		
		System.out.println(countryCodes.remove("Pakisthan"));
		
		//print the entire map
		System.out.println(countryCodes);
		
		}

}
