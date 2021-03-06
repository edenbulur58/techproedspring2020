package lambda2020;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		
//Lambda is created for "Functional Programming"==>What to do
//The codes we typed until now are called "Structured Programming"==>How to do
		
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
		
//Structured code
		for(int w:list) {//==>How to do
	   System.out.print(w+" ");
		}
	
		
		//Functional code Type 1==>t->System.out.println(t)==>LAMBDA EXPRESSİON
		System.out.println();
		list.stream()                           //[13,10,14,5,7,3,5,13,16]==>13
		    .forEach(t->System.out.println(t));  //                          10
	functionalCode02(list);		                                         //                          14
	System.out.println();                       //                         ...
	functionalCode03(list);
	
	
	}
	
	
	
	//Functional Code Type 2==>Method Reference -->I created a method and use it
	
	public static void print(int num) {
				
	System.out.print(num+ "-");	
				
	}
			
	public static void functionalCode02(List<Integer> list) {
				
	list.stream()
    .forEach(Lambda01::print);//Method Reference==>ClassName::MethodName
						
	}
		
	
	
	//Functional Code Type 3==>Method Reference -->I WİLL USE  the method Java created and use it	
	
	public static void functionalCode03(List<Integer>list) {
	
	list.stream()
	.forEach(System.out::print);//System.out->Class and print -> method name
	
	
   }


	






}

