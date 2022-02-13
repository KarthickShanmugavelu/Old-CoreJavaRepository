package collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(4);
		
		q1.add(2);
		q1.add(23);
		q1.add(4);
		q1.add(5);
		try {
		q1.add(26);
		}
		catch(IllegalStateException e) {
			System.out.println("Adding elements more than Queue size");
		}
		
		System.out.println("Getting first Element using peek method: "+q1.peek());
		
		System.out.println("Printing queue");
		
		for(Integer temp_q:q1) {
			System.out.println("queue value:"+temp_q);
		}
		
		System.out.println("Using Remove method");
		
		System.out.println("Removed element: "+q1.remove());
		System.out.println("Removed element: "+q1.remove());
		System.out.println("Removed element: "+q1.remove());
		System.out.println("Removed element: "+q1.remove());
		try {
		System.out.println("Removed element: "+q1.remove());
		}
		catch(NoSuchElementException e) {
			System.out.println("Accessing element from an empty queue");
		}
		
		for(Integer tempq3:q1) {
			System.out.println("Executing for each of q1");
			System.out.println(tempq3);
		}
		
		System.out.println("Using peek after all elements are removed: "+q1.peek());
		
		System.out.println("Using second set of methods in queue");
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(4);
		
		q2.offer(2);
		q2.offer(2);
		q2.offer(2);
		q2.offer(2);
		if(q2.offer(2) == false)
			System.out.println("Offer method just does not insert once queue becomes full");
		
		for(Integer tempq2:q2) {
			System.out.println("Executing for each of q2");
			System.out.println(tempq2);
		}
		
		System.out.println("Using poll() method");
		System.out.println("value: "+q2.poll());
		System.out.println("value: "+q2.poll());
		System.out.println("value: "+q2.poll());
		System.out.println("value: "+q2.poll());
		System.out.println("value: "+q2.poll());
		System.out.println("value: "+q2.poll());//just returns null once queue becomes empty
		
		System.out.println("Sample Implementation of queue using linkedList");
		
		Queue<Integer> q3 = new PriorityBlockingQueue<Integer>();
		q3.add(2);
		q3.add(3);
		q3.add(3);
		q3.add(3);
		q3.add(3);
		q3.add(3);
		q3.add(3);
		q3.add(8809);
		
		for(Integer i3:q3) {
			System.out.println(i3);
		}
		 System.out.println(q3.peek());
		 System.out.println(q3.remove());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
