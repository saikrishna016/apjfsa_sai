package practise;

public class Modifiers  {

    // public variable
    public int publicVar = 10;

    // private variable
    private int privateVar = 20;

    // protected variable
    protected int protectedVar = 30;

    // default (package-private) variable
    int defaultVar = 40;

    // public method to access private variable
    public int getPrivateVar() {
        return privateVar;
    }
    
    // public method to modify private variable
    public void setPrivateVar(int value) {
        privateVar = value;
    }
}
//main method to test the access specifiers
class AccessSpecifiers extends Modifiers {
	
public static void main(String[] args) {
 Modifiers obj = new Modifiers();

 // accessing public variable
 System.out.println("Public variable: " + obj.publicVar);

 // accessing private variable using getter method
 System.out.println("Private variable: " + obj.getPrivateVar());

 // modifying private variable using setter method
 obj.setPrivateVar(50);
 System.out.println("Modified private variable: " + obj.getPrivateVar());

 // accessing protected variable
 System.out.println("Protected variable: " + obj.protectedVar);

 // accessing default variable
 System.out.println("Default variable: " + obj.defaultVar);
}
}


