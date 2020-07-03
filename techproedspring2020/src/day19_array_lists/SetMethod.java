package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {

	public static void main(String[] args) {
		// set() is used to change the elemet
		List<String>list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		System.out.println(list1);//[Ali,Veli,Can]
		
	//Change "Ali" to "John"	
	System.out.println(list1.set(0, "John"));
	System.out.println(list1);//set method returns dissappeared element which is Ali
	
	/*
	//Do not use set() to add something to do list
	System.out.println(list1.set(3, "George"));//ıf you use index which is greater than or equal to 
	//the length of the list, you will get IndexOutOfBoundException
	*/
	
	System.out.println(list1.set(0, ""));
	System.out.println(list1);
	}

}
