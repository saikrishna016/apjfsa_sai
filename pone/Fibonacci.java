package pone;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {
		
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.println("Enter the range :");
		
		int range = scanner.nextInt();
	
		int num1 =0,num2=1;
		System.out.println("fibonacci sequence:");
		
		for(int i=0; i<range;i++)
			{
			
			System.out.print(num1+" ");
			int num3=num1+num2;
			num1 =num2;
			num2 =num3;
			}
		
	}
}
