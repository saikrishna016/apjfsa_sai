package practise;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args ) {
		int ACbalance = 100000;
		Scanner sc =new Scanner(System.in);
		
	while(true) {
		 System.out.println("Welcome to ATM ");	
	   System.out.println("1. Withdraw Amount");
	   System.out.println("2. Depoist Amount");
	   System.out.println("3. Balance Enquiry");
	   System.out.println("4. exit");
	
	   System.out.println("Enter the choice");
   int choice = sc.nextInt();
   
   switch(choice) {
   case 1:
	   System.out.println("Enter the Withdrawal amount");
	   int WithdrawAmount = sc.nextInt();
	   if(WithdrawAmount > ACbalance)
	   {
		   System.out.println("Insufficiant amount");
	   }
	   else {
		   ACbalance -= WithdrawAmount;
		   System.out.println("Withdrawal Amount =" +WithdrawAmount + "A/Cbalance" +ACbalance);
		   return ;}
	break;
	
	
   case 2:
	   System.out.println("Enter the Depoist amount");
	   int DepoistAmount = sc.nextInt();
	   ACbalance +=DepoistAmount ;
	   System.out.println("Depoist amount =" +DepoistAmount +"A/C balance ="+ACbalance);
	   break ;
   case 3:
	   System.out.println("A/C balance =" +ACbalance);
	   break ;
   case 4 :
	   System.out.println("Thank You");
	   break ;
   default :
	   System.out.println("Invaild ");
	   break;
   }
}}
}