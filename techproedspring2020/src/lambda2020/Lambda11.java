package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda11 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		System.out.println(list); //[13,10,14,5,7,3,5,13,16]
	
	//Print all elements on the console in uppercase by using Functional Programming
	//Type 1
		list.stream()
		    .map(t->t.toUpperCase())
		    .forEach(System.out::print);
	System.out.println();
	
	//Type 3
	list.stream()
	    .map(String::toUpperCase)
	    .map(t-> t+" ")
	    .forEach(System.out::println);
	
	//Print all elements on the console in upper case by using replaceAll() in Functional Programming
	//Type 1
	list.replaceAll(t->t.toUpperCase());
	System.out.println(list);//[ALI,MARK,JACKSON,AMANDA,CHRIS,TUCKER]
	
	//Type 3
	list.replaceAll(String::toUpperCase);
	System.out.println(list);//[ALI,MARK,JACKSON,AMANDA,CHRIS,TUCKER]
	
	//Remove the elements less than 5
	list.removeIf(t->t.length()<5);
	System.out.println(list); //[JACKSON,AMANDA,CHRIS,TUCKER]
	
	
			
			
	}

	
}
