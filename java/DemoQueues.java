package anudip.java;

import java.util.PriorityQueue;

public class DemoQueues {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(13);
		pq.add(26);
		pq.add(12);
		
		System.out.println(pq);
		pq.add(19);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
