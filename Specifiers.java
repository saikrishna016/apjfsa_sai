package practise;

public class Specifiers {

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

    // main method to test the access specifiers
    public static void main(String[] args) {
        Specifiers spe = new Specifiers();

        // accessing public variable
        System.out.println("Public variable: " + spe.publicVar);

        // accessing private variable using getter method
        System.out.println("Private variable: " + spe.getPrivateVar());

        // modifying private variable using setter method
        spe.setPrivateVar(50);
        System.out.println("Modified private variable: " +spe.getPrivateVar());

        // accessing protected variable
        System.out.println("Protected variable: " + spe.protectedVar);

        // accessing default variable
        System.out.println("Default variable: " + spe.defaultVar);
    }
}


