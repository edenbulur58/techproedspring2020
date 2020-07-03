package day30_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
	
	//Create a linked list
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Mark");
		list.add("Amanda");
		list.add("john");
		list.add("Ann");
		list.add("Pamela");
		System.out.println(list);
		
		//To remove first element you can use remove(0) or removeFirst()
		list.remove(0);
		//list.removeFirst();
		
		System.out.println(list);//[Amanda,John,Ann,Pamela]
		//System.out.println(list);
		
		//To remove last element
		list.removeLast();
		System.out.println(list);//[Amanda,John,Ann]
		
		//To remove any element use index with remove method
		list.remove(1);
		System.out.println(list); //[Amanda,Ann]
		
		//To add an element to beginning of the linked test
		list.addFirst("Ali");
		System.out.println(list); //[Ali,Amanda,Ann]
		
		//To add an element to the last of the linked test
		list.addLast("Can");
		System.out.println(list); //[Ali,Amanda,Ann,Can]
				
		//To add an element to specific test
		list.add(2,"Alter");
		System.out.println(list); //[Ali,Amanda,Alter,Ann,Can]
		
		//How to use iterator for linked list
		Iterator <String> itr=list.iterator();
		//Iterator can be used on the left side as a data type,
		//but you can not use on the right side
		//Because every time we can use methods() or constructors() on the right side
		//We can not create object by using iterator because it is not constructors
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
			//if you use iterator you have just three methods: hasNext(), next(),remove().That's it.
		//if you use list iterator you will have many methods.(set(),previous(), next()....)	
		
		}
		//TO COPY A LİST TO ANOTHER LİST.use empty list first,the existing should be parameter
		LinkedList<String>copiedList=new LinkedList<String>();
		copiedList.addAll(list);
		System.out.println(copiedList);
		
		//To copy a list after a specific element [A,B,C] [X,Y]==>[A,B,X,Y,C]
		
		LinkedList<String> smallList=new LinkedList<String>();
		smallList.add("X");
		smallList.add("Y");
		System.out.println(smallList);//[X,Y]
		copiedList.addAll(2, smallList);
		System.out.println(copiedList); //[Ali,Amanda,X,Y,Alter,Ann,Can]
		
		//To check if an element is inside the Linked list
		
		System.out.println(copiedList.contains("Ann")); //True
		System.out.println(copiedList.contains("Kemal")); //False
		
		//To remove all elements inside the linked test
		smallList.clear();	//returns void so we must use this code inside the System.out.println(" ")); 	
		System.out.println(smallList);//[]		
				
				
				
		
		
	}
	

}
