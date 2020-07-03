package day30_collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
		
	//Dequeue is an interface	
	//Dequeue=Double Ended Queue, Dequeue can use  FIFO and LIFO(Last In First Out)
		
	//Create a Dequeue	
		
	Deque<String> deque=new LinkedList<String>();
	//Add the elements
	deque.add("B");
	deque.add("A");
	deque.add("D");
	deque.add("C");
	System.out.println(deque);//[B,A,D,C]
	
	//push() adds the element at the head of the dequeue 
	//addFirst() does the same 
	deque.push("X");
	System.out.println(deque);//[X,B,A,D,C]
	
	//offer() adds the element at the tail of the dequeue 
		//addLast() does the same 
	deque.offer("Z");
	System.out.println(deque);//[X,B,A,D,C,Z]
	
	//pop() returns the head and removes it
		deque.pop(); //X
		System.out.println(deque);//[B,A,D,C,Z]
	
		//To reverse a dequeue, use descendingIterator()
	Iterator<String>itr2=deque.descendingIterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+ " ");
		}
		
	
	}

}
