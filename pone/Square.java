package pone;

public class Square implements Shapes {
	
	int side;
	//Constructor with parameter side
	public Square(int side) {
		//super();
		this.side = side;
	}
	
	@Override
	public int area() {
		int area=side*side;
		return area;
		
	}
	
    @Override
    public int perimeter() {
    	int perimeter =4*side;
    	return perimeter;
    }
	public static void main(String[] args) {
		Square s =new Square(15);
		int a = s.area();
		int p = s.perimeter();
		System.out.println("Area ="+a);
		
		System.out.println("Perimeter ="+p);

	}

}
