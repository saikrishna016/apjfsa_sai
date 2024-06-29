package practise;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		int[][]arr = new int[2][2];
		arr[0][0]=10;
		arr[0][1]=11;
		arr[1][0]=12;
		arr[1][1]=13;
		
		int i,j;
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

	
	int[][] arr1 = {{1,2,3},{2,3,4}};
	
	System.out.println("no of rows in arr1 ="+arr1.length);
	System.out.println("no of columns in arr1 ="+arr1[0].length);
	}
}
