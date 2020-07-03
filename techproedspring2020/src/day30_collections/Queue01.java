package day30_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		
		// to create a Queue YOU CAN USE LinkedList or PriorityQueue
		Queue<String> queue=new LinkedList<String>();
		
		//To add elements
		queue.add("A");
		queue.add("D");
		queue.add("C");
		queue.add("B");
		System.out.println(queue); //[A,D,C,B]
		
		//To remove an element use remove();
		queue.remove(); //it will remove A (FIFO)
		System.out.println(queue); //[D,C,B]
		
		queue.remove(); //it will remove D(FIFO)
		System.out.println(queue); //[C,B]
		
		//To get the head of the Queue use element() ==>copy+paste
		System.out.println(queue.element()); //C
		System.out.println(queue);
		
		//To remove and get the first element use poll()==>Similar to cut+paste
		System.out.println(queue.poll()); //C
		System.out.println(queue);//[B]
		
		//To get the first element use peek()
		//peek() similar to element(); but peek() returns null if the queue is empty
		System.out.println(queue.peek()); //B
		System.out.println(queue);//[B]
		queue.remove(); //THE QUEUE İS EMPTY
		System.out.println(queue); //null
		System.out.println(queue.element());//if you use element() for an empty queue 
		//you will get NoSuchElementException
		
		
		
		
		
		
		
		
		
		
		
	}

}
