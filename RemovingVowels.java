package practise;
import java.util.Scanner; 
//Import the Scanner class for user input

public class RemovingVowels {



	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        System.out.print("Enter a string: "); // Prompt user for input
        
        String input = scanner.nextLine(); // Read the input string
        
        // Remove all vowels (both lowercase and uppercase) from the input string
        String result = input.replaceAll("[aeiouAEIOU]", "");
        
        // Print the result string without vowels
        System.out.println("String without vowels: " + result);
    
}

}
