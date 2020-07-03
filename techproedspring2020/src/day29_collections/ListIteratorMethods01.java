package day29_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		
List<String>list=new ArrayList<>();

list.add("A");
list.add("B");
list.add("C");

System.out.println(list);

ListIterator<String> litr=list.listIterator();
//Print all element on the console by using ListIterator

while(litr.hasNext()) {
	Object element=litr.next();
	System.out.print(element + " ");
}
System.out.println();
//To print elements backwards use hasPrevious() and previous
while(litr.hasPrevious()) {
	Object element=litr.previous();
	System.out.print(element + " ");
	
}
while(litr.hasNext()) {
	litr.next();
	litr.remove();
	
}
System.out.println();
System.out.println(list);
	}

}
