package pone;

public class DemoString {

	public static void main(String[] args) {
		
		//String declaration using literal
		String name ="Anudip";
		System.out.println(name);
		//defining String using constructor
		String Course = new String("APJFSA Course");
		System.out.println(Course);
		
		char[] CourseType = {'a','w','s'};
		
		//Defining string using character array
		String course1=new String(CourseType);
		
		System.out.println(course1);
		
		System.out.println(name.concat("Foundation"));
		
		name="Anudip Foudation";
		
		System.out.println(name);
		
		System.out.println(name.charAt(15));
		System.out.println(name.indexOf('n'));
		System.out.println(name.lastIndexOf('n'));
		
		System.out.println(name.indexOf('n',2));
		System.out.println(name.length());
		System.out.println(name.contains(Course));
		
		System.out.println(name.indexOf('c'));
		
		System.out.println(name.equals(course1));
		
		String name1 ="anudip foundation";
		
		System.out.println(name.compareTo(course1));
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		
	

	}

}
