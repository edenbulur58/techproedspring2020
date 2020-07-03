package day20_list_foreachloop;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {

String arr[]= {"Ali","Veli"};
System.out.println("Array: "+ Arrays.toString(arr));//[Ali,Veli]

List<String> list=Arrays.asList(arr);//To convert an array to a list use "asList()"
//"asList()" method create a list from array; but the list is not flexible in size, it is fixed size list
System.out.println("List: "+ list);//[Ali,Veli]
		
list.set(0, "Can");	
System.out.println(list.set(0, "Can"));// Can
System.out.println(list);	//[Can,Veli]

System.out.println("Array: "+ Arrays.toString(arr));//it is weird you will get [Can,Veli]
//for the array. They use the same value store in heap memory
	
list.remove("Veli");
System.out.println(list);//UnsupportedOperationException==>You cannot use remove()

	}

}
