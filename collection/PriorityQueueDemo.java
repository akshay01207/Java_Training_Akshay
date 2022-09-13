package com.dataStructure.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
		
		// Creating empty priority queue
	    PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

	    // Adding items to the pQueue using add()
	    pQueue.add(10);
	    pQueue.add(20);
	    pQueue.add(15);
	    pQueue.add(30);
	    pQueue.add(22);
	    pQueue.add(5);

	    // Printing the top element of PriorityQueue
	    System.out.println(pQueue.peek());
	    System.out.println(pQueue.poll());
	    
	    
	    System.out.println(pQueue.peek());

	}


}
