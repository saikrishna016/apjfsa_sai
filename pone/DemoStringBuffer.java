package pone;

public class DemoStringBuffer{

	    public static void main(String[] args) {
	        // Create a StringBuffer object with the initial string "Anudip"
	        StringBuffer strbuff = new StringBuffer("Anudip");
	        
	        // Append the string "Foundation" to the end of the StringBuffer
	        strbuff.append("Foundation");
	        
	        // Print the resulting StringBuffer
	        System.out.println(strbuff); // Output: AnudipFoundation
	        
	        // Reverse the StringBuffer and print it
	        System.out.println(strbuff.reverse()); // Output: noitadnuFipudna
	        
	        // Print the character at index 3 of the StringBuffer
	        System.out.println(strbuff.charAt(3)); // Output: d
	        
	        // Print the index of the first occurrence of the character 'c' in the StringBuffer
	        System.out.println(strbuff.indexOf("c")); // Output: 7
	        
	        // Print the capacity of the StringBuffer
	        System.out.println(strbuff.capacity()); // Output: 34
	        
	        // Create a new StringBuffer object with a long string
	        StringBuffer strb = new StringBuffer("Advance Program On Java FullStack Using Angular");
	        
	        // Print the capacity of the new StringBuffer
	        System.out.println(strb.capacity()); // Output: 40
	        
	        // Delete the character at index 8 of the StringBuffer
	        strb.deleteCharAt(8);
	        System.out.println(strb); // Output: Advance Program On Java FullStack Usin Angular
	        
	        // Get the code point at index 1 of the StringBuffer (but don't print it)
	        strb.codePointAt(1);
	        
	        // Print the code point at index 0 of the StringBuffer
	        System.out.println(strb.codePointAt(0)); // Output: 65 (ASCII value of 'A')
	        
	        // Compare the two StringBuffer objects and print the result
	        System.out.println(strb.compareTo(strbuff));
	        
	        // Create a new String object with the value "hello"
	        String stt = "hello";
	        
	        // Create a new StringBuffer object from the String object
	        StringBuffer strbf = new StringBuffer(stt);
	        
	        // Reverse the StringBuffer and convert it to a String
	        String Rev = strbf.reverse().toString();
	        
	        // Print the reversed String
	        System.out.println(Rev); // Output: olleh
	    }
	}