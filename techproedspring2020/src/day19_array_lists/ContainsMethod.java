package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethod {

	public static void main(String[] args) {
		// contains() method is used to check if an element exist inside a list or not
		//contains() method returns boolean
		List<String>list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		System.out.println(list1);//[Ali,Veli,Can]
		
		System.out.println(list1.contains("Ali"));//true
		System.out.println(list1.contains("John"));//false
		
	}

}
