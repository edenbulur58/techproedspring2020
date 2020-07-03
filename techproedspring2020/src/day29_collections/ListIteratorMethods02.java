package day29_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
	
		List<String>list=new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		System.out.println(list);
		
		ListIterator<String>litr=list.listIterator();
		
		//TO UPDATE ELEMENTS ONE BY ONE WE USE set()
		while (litr.hasNext()) {
		Object element=litr.next();
		litr.set(element + "W");
			
			
		}
		System.out.println();	
        System.out.println(list);
//ListIterator has add() method to add elements to the list
	litr.add("D");
	litr.add("E");
		System.out.print(list);//[D,E,A,B,C]
		
	}

}
