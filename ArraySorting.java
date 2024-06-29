package practise;

public class ArraySorting {

	public static void main(String[] args) {
		
		// Declaring an array of integers
		int arr[]= {7,9,5,4,6};
		
		//Getting the length of the array
		int n=arr.length;
		//Declaring variables for loop counters and temporary swap
		int i,j;
		int temp;
		
		//Using nested for loops to sort the array
		for(i=0;i<n-1;i++) {
			// inner loop to compare and swap adjacent elemts
			
			for(j=0;j<n-i-1;j++) {
				
				//If the current elements is less than the next element ,swap them
				if(arr[j]>arr[j+1]) {
					
					// Swap the elements using a temporary variable
					temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				
			}
		}
	}
		//Print the sorted array
		for (i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}


