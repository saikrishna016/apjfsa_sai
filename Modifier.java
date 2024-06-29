//package practise;
////Class Modifier with a public method to access the private variable of ClassA
//
//public class Modifier  extends AccessModifier{
//	
//	    // Public method to access the private variable of Class AcessModifier
//	    public int getPrivateVariable( a) {
//	        return privateVariable;
//	    }
//
//	    // Main method
//	    public static void main(String[] args) {
//	         AccessModifier a = new AccessModifier();
//
//	        // Accessing public variable of ClassA
//	        System.out.println("Public variable of ClassA: " + a.publicVariable);
//
//	        // Trying to access private variable of ClassA directly
//	        // This will result in a compile-time error
//	        // System.out.println("Private variable of ClassA: " + a.privateVariable);
//
//	        // Accessing private variable of ClassA using the public method of ClassB
//	        Modifier b = new Modifier();
//	        System.out.println("Private variable of ClassA: " + b.getPrivateVariableOfClassA(a));
//
//	        // Accessing protected variable of ClassA within the same package
//	        System.out.println("Protected variable of ClassA: " + a.protectedVariable);
//
//	        // Accessing default variable of ClassA within the same package
//	        System.out.println("Default variable of ClassA: " + a.defaultVariable);
//	    }
//	
//
//}
//
//
