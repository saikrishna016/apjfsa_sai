package anudip.java;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet<String> coursesNames = new HashSet<String>();
		//HashSet coursesNames = new HashSet(;)
		coursesNames.add("java");
		coursesNames.add("c");
		coursesNames.add("CPP");
		coursesNames.add("Python");
		coursesNames.add("AWS");
		// String s=(String) ((Object) coursesNames).get(0);
		
		for(String s:coursesNames)
			System.out.println(s+  " and");
		
		coursesNames.add("java");
		coursesNames.add(null);
		coursesNames.add(null);
		
		System.out.println(coursesNames);
		coursesNames.remove("CPP");
		System.out.println(coursesNames);
		
		
	}

}
