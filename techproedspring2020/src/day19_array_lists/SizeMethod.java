package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class SizeMethod {

	public static void main(String[] args) {
		/* To get the number of the elements in a list we use size() method
		 */
	
	List<String> list1=new ArrayList<>();
	System.out.println(list1.size());  //0
	
	list1.add("A");
	System.out.println(list1.size());  //1
	
	//Array and ArrayLists allows duplication
	list1.add("A");
	System.out.println(list1.size());  //2
	
	//How can you understand a list has no any element?
	//list1.size()=0 means there is no any element inside the list
	
	//isEmpty() returns boolean. If the list has no any element it returns true; otherwise returns false
	System.out.println(list1.isEmpty());//false
	List<String>list2=new ArrayList<>();
	System.out.println(list2.isEmpty());//true
	}

}
