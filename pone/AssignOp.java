//program using assignment operators
package pone;

public class AssignOp {

	public static void main(String[] args) {
		
    int a,b;
    a=50;
    b=40;
    System.out.println("a="+a+",b="+b);
     a+= 20;
     System.out.println("a="+a);
     
     b-=40;
     System.out.println("b="+b);
     System.out.println("a==b is "+(a==b));
	}
}
