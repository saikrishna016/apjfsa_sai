package pone;

public class Rectangle extends Shape{
	    
        int length,breath;
        
        public Rectangle(String name ,int length,int breath) {
        	super(name);
        	this.length =length;
        	this.breath = breath;
        }
    
    void area(){
        int a=length*breath;
        System.out.println("Area="+a);

    
}
public static void main(String[] args) {
     Rectangle rectangle = new Rectangle("rectangle:",30,40);
    rectangle.shapeinfo();
    rectangle.area();

}
}


