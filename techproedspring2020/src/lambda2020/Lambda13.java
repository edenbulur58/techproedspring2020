package lambda2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda13 {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		list.add(13);
		list.add(10);
		list.add(14);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(13);
		list.add(16);
		
		System.out.println(list);

	//How to sort list elements
		Collections.sort(list);
		System.out.println(list);
		
	//Print all elements by using Functional Programming on the console	
	list.stream()
	    .map(t->t+" ")
	    .forEach(System.out::print);//Method reference
	
	System.out.println();
	//How to create stream without using list
	Stream.of(3,5,5,7,10,13,13,14,16)
	      .map(t->t+" ")
	      .forEach(System.out::print);
	
	//How to use Functional programming for arrays
	int [] arr= {13,21,34,65,1,43};
	
/*	//First Way:Convert the array to list them use Functional Programming
	List<int []> listFromArray=Arrays.asList(arr);
	listFromArray.stream()
	             .map(t->t+" ")
	             .forEach(System.out::print);//13 21 2 34 65 1 43
*/	
System.out.println();

//SecondWay:Use Arrays.stream(arr)
Arrays.stream(arr)	
      .forEach(System.out::print);//132123465143

System.out.println();
//Find the minimum value of the array elements by using Functional Programming
System.out.println(Arrays.stream(arr)
		                 .min());//1
	
     Arrays.stream(arr)
	       .sorted()
	       .limit(1)
	       .forEach(System.out::print);
     
     System.out.println();
   //Find the maximum value of the array elements by using Functional Programming     	
	System.out.println(Arrays.stream(arr)
		                     .max());	
	
	System.out.println();
	//Find the average value of the array elements by using Functional Programming     	
	System.out.println(Arrays.stream(arr)
			                 .average());
	
	System.out.println();
	//Find the average value of the array elements by using Functional Programming     	
	System.out.println(Arrays.stream(arr)
			                 .sum());
	
	
	
	
	
	}

}
