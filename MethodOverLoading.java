package practise;

public class MethodOverLoading {
	
	//area of Rectangle using two parameters
  int area(int length ,int width) {
	  return length * width;
	  }
  
  
  //Area of Square using single parameter
  int area(int side) {
	  return side*side;
  }
  
  
   
  //Area of Circle using two parameters
  double area(float pi ,int radius) {
	  return pi*radius*radius;
  }
public static void main(String[] args) {
	MethodOverLoading method =new MethodOverLoading();
	System.out.println("Area of square :"+method.area(5, 5));  //Output :25
	System.out.println("Area of Rectangle :"+method.area(10));  //Output :100
	System.out.println("Area of Circle :"+method.area(3.14f , 5));  //Output : 78.5
}
}