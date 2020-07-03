package day20_list_foreachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMethodInLists {

	public static void main(String[] args) {
		
List <String> birds=new ArrayList<>();
birds.add("B");
birds.add("A");
birds.add("C");

System.out.println("Before sorting :"+ birds); //[B,A,C]
Collections.sort(birds);
System.out.println("After sorting :"+ birds);  //[A,B,C]
	
List <Integer> list=new ArrayList<>();
list.add(5);
list.add(3);
list.add(7);

System.out.println("Before sorting :"+ list); //[5,3,7]
Collections.sort(list);
System.out.println("After sorting :"+ list);  //[3,5,7]		


	}

}
