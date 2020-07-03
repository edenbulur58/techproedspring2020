package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class lambda04 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		System.out.println(list); //[13,10,14,5,7,3,5,13,16]
//Use Functional Code
//Get the elements whose lengths are more than 5 and print their lengths on the console
		list.stream()
		    .filter(t->t.length()>5)
		    .map(t->t.length() + " ")
		    .forEach(System.out::print);

//Get the elements which contain "i"		
		System.out.println();
		list.stream()
		    .filter(t->t.contains("i") )
          //  .map(t->t.contains("i")+ " ")
            .forEach(System.out::print);
		
		
	}
	

}
