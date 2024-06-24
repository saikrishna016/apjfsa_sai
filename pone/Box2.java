package pone;

public class Box2 {

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
		Box2 b=new Box2();
		b.length=10;
		b.breadth=50;
		b.measurements();
		
		a = 100;
		 Box2.msg();
		
		
		Box2 b1=new Box2();
		b1.length=200;
		b1.breadth=50;
		b.measurements();
		 
		Box2 b2=b1;
		b2.measurements();
	}
}
