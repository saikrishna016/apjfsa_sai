package pone;

public class Box {

	//instance variable
	int length,breadth;
	
	
	//static variable
	static int a;
	
	
	//instance method
	void measurements()
	{
		System.out.println("measurements of a Box : "+length+","+breadth);
		
	}
	 static void msg() {
		 System.out.println("static block : " + a);
	 }
	public static void main (String[] args)
	{
	//object creation for box
		Box b=new Box();
		b.length=10;
		b.breadth=50;
		b.measurements();
		
		a = 100;
		 Box.msg();
		
		
		Box b1=new Box();
		b1.length=200;
		b1.breadth=50;
		b.measurements();
		 
		Box b2=b1;
		b2.measurements();
	}
}
