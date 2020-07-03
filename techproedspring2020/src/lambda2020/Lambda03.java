package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {

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
		System.out.println(list); //[13,10,14,5,7,3,5,13,16]
	
//Use structured method to print the square of every element on the console
	
	for(int w:list) {
		
		System.out.println(w*w+" ");	
		
	}

	//Use Functional Code to print the square of every element on the console
	list.stream()
	    .map(t->t*t)                 //map() gets the element, updates it according to the right part (t*t)
	    .forEach(System.out::print);//and navigates to the next line
	
	System.out.println();
	
	//Print the cube of every odd elements
	list.stream()
	    .filter(t->t%2!=0)
	    .map(t->t*t*t + " " )
	    .forEach(System.out::print);
	
	//Print the square of the elements which are divisible by 4
	System.out.println();
	list.stream()
	    .filter(t->t%4==0)
	    .map(t->t*t + " ")
	    .forEach(System.out::print);//just one element 256
	    //First filter than update(use map ())
	System.out.println();
	list.stream()
	    .map(t->t*t )
	    .filter(t->t%4==0)
	    .forEach(System.out::print);//100 196 256
	    

	
	
	
	
	}

}
