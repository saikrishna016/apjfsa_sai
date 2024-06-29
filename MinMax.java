package practise;

public class MinMax {

	public static void main(String[] args) {
		//initialize an array 
		int arr[] = {5,8,10,8,6,4};
		
		//initialize min and max variables with first element of array 
		 int min =arr[0];
		 int max= arr[0];
		 
		  //loop though the array
		 for(int i=0;i<arr.length;i++){
			 
		 //if the cuurent element is smaller than min,update min
		 if(min >arr[i]) {
		         min =arr[i];
		         
		 }
		 
		 
		 //if the cuurent element is larger than max,update min
		if(max<arr[i]) {
				max =arr[i];
		}
		 }
		 
		 // print the minimum and maximum values
		 System.out.println("Minimum is  "+min);
		 System.out.println("Maximum is  "+max);
					 
	}

}
