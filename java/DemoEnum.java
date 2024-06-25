package anudip.java;

// Define an enum called Department with four values: Accounts, Devops, Testing, and HR
enum Department {
    Accounts,
    Devops,
    Testing,
    HR
}

public class DemoEnum {
    public static void main(String[] args) {
        // Declare a variable of type Department and assign it the value Testing
        Department d = Department.Testing;
        
        // Declare another variable of type Department and assign it the value Accounts
        Department d1 = Department.Accounts;
        
        // Print the value of d1
        System.out.println(d1); // Output: Accounts
        
        // Compare the two enum values using the compareTo() method
        System.out.println(d.compareTo(d1)); // Output: 2 (because Testing is 2 positions after Accounts in the enum declaration)
        
        // Check if the two enum values are equal using the equals() method
        System.out.println(d.equals(d1)); // Output: false (because Testing is not equal to Accounts)
    }
}