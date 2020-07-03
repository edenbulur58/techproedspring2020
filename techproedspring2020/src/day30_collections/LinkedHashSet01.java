package day30_collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// To create a linkedHashSet
		LinkedHashSet <String>lhSet=new LinkedHashSet<String>();
		
		lhSet.add("C");
		lhSet.add("D");
		lhSet.add("B");
		lhSet.add("A");
		System.out.println(lhSet); //[C,A,D,B]
		
		//Convert lhSet to TreeSet to put the elements in natural order
		Set<String> treeSet=new TreeSet<String>(lhSet);
		System.out.println(treeSet); //[A,B,C,D]
		
		//To get the size
		System.out.println(lhSet.size());
		
		//To remove an elements
		lhSet.remove("C");
		System.out.println(lhSet); //[A,D,B]
		lhSet.remove("D");
		System.out.println(lhSet); //[A,B]
		
		//to get HashCode. hashCode() is returning the sum of the hashCodes of all elements
		System.out.println(lhSet.hashCode());
		
		
		//To remove all elements
		System.out.println(lhSet.removeAll(lhSet));//true
		System.out.println(lhSet); //[]
		
		
		
		
		
	}

}
