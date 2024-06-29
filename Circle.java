package practise;

public class Circle extends Shape {
	int radius;
	
	public Circle(int r){
		
		radius=r;
		
	System.out.println(" circle is created");
	}
	 public void Area() {
		 
		 System.out.println("Area : "+radius*radius);
	 }

	 public static void main(String[] args)
	 {
	  Circle cir =new Circle(5);
	  //cir.radius = 20;
	  
	  cir.draw();
	  cir.Area();
	 }
}
