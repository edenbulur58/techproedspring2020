package day24_inheritance_certificate_prep;

public class RunnigOrderOfConstructorChild extends RunnigOrderOfConstructorsParent {

	
	
	public static void main(String[] args) {
		
RunnigOrderOfConstructorChild objChild=new RunnigOrderOfConstructorChild ();

//Every Time Parent Constructor runs first
	//if Parent constructor does not run first we can not use data inside the parent class 
	//Then child constructor runs and be available to use parent data
//super() must be first statement in a constructor every time	
	//In a child constructor, you can use super() just once.
//Because , if you use it twice, second one cannot be the first statement
	}
public  RunnigOrderOfConstructorChild () {
	
super(5);//super() is used to call parent constructor
//if you do not use super you can use just parent constructor without paremeter
	System.out.println("This is the constructor of the Child class");


}




}
