package pone;

import java.util.Scanner;

public class DemoBreak {

	public static void main(String[] args) {
		
		int withdrawAmount , sumAmount = 0 , ACbalance  = 120000;
		Scanner sc = new Scanner(System.in);
		  
		while (ACbalance > 0) {
		 System.out.println("Enter amount to withdraw :");
		 withdrawAmount = sc.nextInt();
		 sumAmount +=withdrawAmount;
		 
		 if(sumAmount>50000) {
			 System.out.println("limit exceeded");
			 
		  break;
		 }
		 ACbalance-=withdrawAmount;
		 System.out.println("a/C balance="+ACbalance+"Amount withdraw:"+sumAmount);
		 
		 
		 
		}

	}

}
