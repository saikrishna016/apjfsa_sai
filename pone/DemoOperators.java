package pone;

public class DemoOperators {

	public static void main(String[] args) {
	   //Logical Operators

		boolean a=true;
		boolean b=false;
		
		System.out.println("a&&b="+(a&&b));
		System.out.println("a||b="+(a||b));
		System.out.println("!a="+(!a));
		
		//Bit wise Operators
		
		int x=0b10011;
		int y=0b1110;
		
		System.out.println("x&y="+(x&y));
		System.out.println("x|y="+(x|y));
		System.out.println("x^y="+(x^y));
		System.out.println("~x="+(~x));
		
		// Shit Operators
		System.out.println("x<<1="+(x<<1));
		System.out.println("y>>2="+(y>>2));
		
		//tenary Operator
		
		int p,q;
		p=20;
		q=30;
		int big=q>p?p:q;
		
		System.out.println("big="+big);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
