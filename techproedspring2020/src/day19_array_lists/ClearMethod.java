package day19_array_lists;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

	public static void main(String[] args) {
		// clear () is used to delete all elements inside a list
		List<String>list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Can");
		System.out.println(list1);//[Ali,Veli,Can]
		
		list1.clear();//Deleted Ali,Veli and Can
		//ıf the return type is "void" do not it inside the System.out.println();
		//if you do it you will get Compile Time Error
		
	System.out.println("After clearing"+list1); //[]
	}

}
