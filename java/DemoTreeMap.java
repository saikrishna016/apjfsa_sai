package anudip.java;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(11,"Developer");
		tmap.put(2,"Tester");
		tmap.put(13, "Tech Support");
		tmap.put(41, "Data Analyst");
		tmap.put(10, "Data Base Administrator");
		tmap.put(5, "System Architect");
		
		tmap.put(-1, "Trainer");
		tmap.put(-1, "Trainer");
		
		tmap.put(0, null);
		System.out.println(tmap);
		System.out.println(tmap.get(10));
		
		if(tmap.containsKey(41))
		System.out.println("job role with ID 41 is in the map");
		
		if(tmap.containsValue("Tester"))
		System.out.println("exists in map");
		
		System.out.println("first entry :"  +tmap.firstEntry());
		System.out.println("Last entry :"   +tmap.lastEntry());

		TreeMap<Double,Integer> tmap1 = new TreeMap<Double,Integer>();
		
		tmap1.put(32.05, 100);
		tmap1.put(56.432, 43);
		
		System.out.println(tmap1.floorKey(56.0));
		System.out.println(tmap1.ceilingKey(32.1));
				
		
	}

}
