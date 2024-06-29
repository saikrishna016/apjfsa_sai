//package practise;
//
//public class MyClass {
//
////Class with different access modifiers
//
//
// public int publicVar;
// private int privateVar;
// protected int protectedVar;
// int defaultVar;
//
// // Constructor to initialize variables
// public MyClass(int publicVar, int privateVar, int protectedVar, int defaultVar) {
//     this.publicVar = publicVar;
//     this.privateVar = privateVar;
//     this.protectedVar = protectedVar;
//     this.defaultVar = defaultVar;
// }
//
// // Getter for privateVar
// public int getPrivateVariable() {
//     return privateVar;
// }
//
// // Setter for privateVar
// public void setPrivateVariable(int privateVar) {
//     this.privateVar = privateVar;
// }
//}
//
////Another class accessing the variables
//public class AccessModifiersExample {
//
// public static void main(String[] args) {
//
//     // Creating an object of MyClass with initial values
//     MyClass obj = new MyClass(1, 2, 3, 4);
//
//     // Accessing public variable
//     System.out.println("Public Variable: " + obj.publicVar); 
//
//     // Accessing private variable via getter
//     System.out.println("Private Variable (via getter): " + obj.getPrivateVariable());
//
//     // Accessing protected variable
//     System.out.println("Protected Variable: " + obj.protectedVar); 
//
//     // Accessing default variable
//     System.out.println("Default Variable: " + obj.defaultVar); 
//
//     // Modifying private variable via setter
//     obj.setPrivateVariable(1000);
//    
//     // Accessing updated private variable
//     System.out.println("Updated Private Variable (via getter): " + obj.getPrivateVariable()); 
// }
//}
//
//
