package anudip.java;

import java.util.Scanner;

public class DayofWeek {

	 static void printDay(int d) {
		switch(d) {

		case 1: System.out.println("sunday");
		   break;
		   
		case 2: System.out.println("monday");
		   break;
		   
		case 3: System.out.println("tuesday");
		   break;
		case 4: System.out.println("wednesday");
		   break;
   	     case 5: System.out.println("thursday");
		   break;
        case 6: System.out.println("friday");
		   break;
		case 7: System.out.println("saturday");
		   break;
		   default:System.out.println("invalid number");
		   break;
		   
		}
	}
	
	public static void main(String[] args) {
		int dayno;
		System.out.println("enter a day number");
		Scanner scanner = new Scanner(System.in);
		
		dayno=scanner.nextInt();
		 printDay(dayno);
		 printDay(5);
		 
	}
	}
