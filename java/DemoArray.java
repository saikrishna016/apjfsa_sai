
package anudip.java;

import java.util.ArrayDeque;

public class DemoArray {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> arque = new ArrayDeque<Integer>() ;
		
		arque.push(20);
		arque.push(50);
		arque.push(30);
		arque.push(50);
		
		System.out.println(arque);
		System.out.println(arque.poll());
		System.out.println(arque.peek());
		
		
		
		arque.add(10);
		arque.addFirst(10);
		arque.addLast(100);
		System.out.println(arque);
			
		

	}

}
