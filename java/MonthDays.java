package anudip.java;

import java.util.Scanner;

public class MonthDays {
	
	static void printmonth(int month) {
		int days;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		 days=31;
		 break;
		case 4:
		case 6:
		case 9:
		case 11:
		 days=30;
		 break;
		case 2:
		 days=28;
		 break;
		  default:
			days= -1;
			break;
			  
		}
		
		
		
		if(days!=-1) {
			System.out.println("number of days in"+ month +":"+ days);
		}
		else {
			System.out.println("invalid number");
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the month number");
		int month =sc.nextInt();
		
		printmonth(month);
	}
}
