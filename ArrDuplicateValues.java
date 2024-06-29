
package practise;
  // class declaration
public class ArrDuplicateValues {

      // main functions
	public static void main(String[] args) {
		
		//Initialize an array 
		int arr[]= {23,34,56,56,34,26};
		
		//Declare two integer variables
		int i ,j;
		
		// declare an integer variable to count no. of duplicate values
		int count=0;
		
		//using two nested for loops to iterate through the array
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				
				// Check if the current element is a duplicate
				if(arr[i]==arr[j]) {
					// printing  duplicate values
				System.out.println("Duplicate values ="+arr[j]);
				count++;
				}
			}
		}
		// after nested loops ,printing total number of duplicate values found
		System.out.println("Number of Duplicate values ="+count);
	}
}



