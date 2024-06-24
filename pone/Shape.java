package pone;

 abstract public class Shape {
	String name;
	
	public Shape(String name) {
		super();
		this.name = name;
		
	}
	
	void shapeinfo() {
		System.out.println("Name of shape ="+name);
	}
	abstract void area();
     
}
