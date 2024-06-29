package practise;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array of marks obtained by the student in 6 subjects
        int marks[] = new int[6];

        // Get the marks from the user
        System.out.println("Enter the marks for 6 subjects:");
        for(int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Flag to check if the student has passed in all subjects
        boolean isPassed = true;

        // Sum of the marks obtained by the student
        int sum = 0;

        // Loop through the marks array to check if the student has passed in all subjects
        for(int i = 0; i < marks.length; i++) {
            if(marks[i] <= 35) {
                isPassed = false;
                break;
            }
        }

        // Check if the student has passed in all subjects
        if(isPassed) {

            // Calculate the sum of the marks obtained by the student
            for(int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }

            // Calculate the average percentage of marks obtained by the student
            double percentage = (double) sum / marks.length;

            // Print the result and the average percentage of marks obtained by the student
            System.out.println("Student Result: Sum =" + sum + ", Percentage =" + percentage);
        }
        else {
            // Print that the student has failed
            System.out.println("Student got failed");
        }

        
 
    }
}
