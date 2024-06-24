package pone;

public class ArraySearch {

	public static void main(String[] args) {
		
		int arr[] = {20,43,54,67,85,43,23};
		
		int num =53;
		boolean b = false;
		for (int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("Number  found ="+arr[i]);
			b = true;
			break;
			}
		      }
		
		if(!b ){
			
		System.out.println("number is not found");
			
		}
		
			
     }
	}


