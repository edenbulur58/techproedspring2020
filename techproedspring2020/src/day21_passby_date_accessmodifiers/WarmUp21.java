package day21_passby_date_accessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class WarmUp21 {

	public static void main(String[] args) {
		/*
		 * Knowledge:We can use addAll() method to join two ArrayLists
		 * Example:list1=[111,222,333,444] and list2=[666,777,888] then
		 * list1.addAll(list2)=(111,222,333,444,555,666,777)
		 * According to the given knowledge; create two lists and join them by using addAll() method
		 */
		
		List<Integer>list1=new ArrayList<>();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		list1.add(444);
		
		List<Integer>list2=new ArrayList<>();
		list2.add(666);
		list2.add(777);
		list2.add(888);
		
		list1.addAll(list2);
		System.out.println("List2 is added to list1 :"+list1);
		System.out.println("List2  :"+list2);

	   list1.addAll(1,list2);
	   System.out.println("List2 is added to list1 of index 1 :"+list1);
	
	
	
	}

}
