package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class AddMethods {

	public static void main(String[] args) {
		//How to add elements into a list==>add()
	List<String> list1=	new ArrayList<>();
    System.out.println(list1);
    
    //add() without index
    list1.add("Ali");
    System.out.println(list1);
    
    //add() method adds the elements at the end of the list
    list1.add("Ayse");
    System.out.println(list1);
    
    list1.add("Ahmet");
    System.out.println(list1);
    
    //add()method with index
    list1.add(1, "John");
    System.out.println(list1);//Ali,John,Ayse,Ahmet
    
    //if you use the index more than the length of existing list,you will get
    //IndexOutOfBoundsException
    list1.add(4, "Veli");
    System.out.println(list1);//Ali,John,Ayse,Ahmet
    
    
    
	}

}
