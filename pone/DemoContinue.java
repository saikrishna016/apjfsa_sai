package pone;

import java.util.Scanner;

public class DemoContinue {

	public static void main(String[] args) {
		int range,sum=0;
		System.out.println("Enter Range");
		Scanner sc = new Scanner(System.in);
		range =sc.nextInt();
		for(int i=0;i<=range ; i++) {
			if(i%2==0)  //i%2==1
			{
				continue;
			}
			sum+=i;
			System.out.println(sum);
		}

	}

}
