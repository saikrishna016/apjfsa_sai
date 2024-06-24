package pone;

public class DemoStringBuilder {
	public static void main(String[] args) {

    // Create a StringBuilder object with the initial string "Hello world"
    StringBuilder strb = new StringBuilder("Hello world");
    
    // Print the StringBuilder object
    System.out.println(strb); // Output: Hello world
    
    // Print the length of the StringBuilder object
    System.out.println(strb.length()); // Output: 11 (length of "Hello world")
    
    // Print the index of the first occurrence of the character 'o' in the StringBuilder
    System.out.println(strb.indexOf("o")); // Output: 4 (index of the first 'o' in "Hello world")
    
    // Convert the StringBuilder to a String object
    String s = strb.toString();
    
    // Print the String object
    System.out.println(s); // Output: Hello world
    
    // Create a new StringBuffer object from the StringBuilder object
    StringBuffer strb1 = new StringBuffer(strb.toString());
    
    // Print the StringBuffer object
    System.out.println(strb1); // Output: Hello world
}}