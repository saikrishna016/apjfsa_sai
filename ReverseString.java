package practise;

public class ReverseString  {
    
    public static void main(String[] args) {
        
        // Initialize the original string
        String original = "Anudip Foundation";
        
        // Create a char array to hold the reversed string
        char[] reversedArray = new char[original.length()];
        
        // Filling reversedArray with characters from original in reverse order
        for (int i = 0; i < original.length(); i++) {
            reversedArray[i] = original.charAt(original.length() - 1 - i); 
        }
        
        // Convert the reversed char array to a string
        String reversedString = new String(reversedArray);
        
        // Print the original string
        System.out.println("Original: " + original);
        
        // Print the reversed string
        System.out.println("Reversed: " + reversedString);
        
    }

}
