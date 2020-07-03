package day30_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// To create TreeSet
		TreeSet <String>treeSet=new TreeSet<String>();
		
		//To add elements
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("C");
		System.out.println(treeSet);//[A,B,C,D]
		
		//How to sort elements in a HashSet?
		//By Converting HashSet to TreeSet.
		//How do you convert HashSet to TreeSet
		
		HashSet<Integer>hashSet=	new HashSet<Integer>();
		//To add elements 
		hashSet.add(13);
		hashSet.add(21);
		hashSet.add(400);
		hashSet.add(12);
		System.out.println("it does not have any order"+hashSet); 
		
		//Create a TreeSet by using HasSet elements.
		
		TreeSet <Integer>trSet=new TreeSet<Integer>(hashSet);
		System.out.println("HashSet is Converted to TreeSet "+trSet);
		
		
		
		
	}

}
