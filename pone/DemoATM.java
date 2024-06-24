package pone;

import java.util.Scanner;

public class DemoATM {

	public static void main(String[] args) {
		int ACbalance = 20000;
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println(" 1. Withdrraw Amount");
		    System.out.println(" 2.Deposit Money");
		    System.out.println(" 3.Check Balance");
		    System.out.println(" 4.Quit");
        System.out.println(" Enter your choice");
		int choice =sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter amount to withdraw");
		int withdrawAmount =sc.nextInt();
		if (withdrawAmount  > ACbalance)  {
			System.out.println("Insufficient funds");
		}
		else {
			ACbalance -= withdrawAmount;
			System.out.println("Amount withdrawn :" +withdrawAmount);
			System.out.println("Balance amount :" +ACbalance);
			return;
		}
	break;
	  case 2:
		System.out.println("Enter the deposit amount");
		int depositAmount =sc.nextInt();
		ACbalance += depositAmount;
		System.out.println("Amount depoisted :" +depositAmount);
		System.out.println("A/C balance :" +ACbalance);
	break ;	
	case 3:
	   System.out.println("A/C balance :" +ACbalance);	
	break;
	case 4 :
		System.out.println("Thank you Have a good day");
	break;
		default :
			System.out.println("invalid choice");
			break ;
			
	}
}}
}