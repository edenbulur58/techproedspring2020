package day23_Encapsulation;

public class Encapsulation01 {

	 private static String CCN = "1234567891011121";
	 private int Ssn=123456789;
	 private boolean customer=true;
	 
	public static void main(String[] args) {
		
/*
 * OOP==>Object Oriented Programming
 * OOP has 3 main fundamentals
 * 1)Polymorphism
 * 2)Inheritance
 * 3)Abstraction
 * 4)Encapsulation (data hiding)===>1 )By using encapsulation we hide the data, and we can access the hidden data
 * 		For encapsulation==>1)Data must be private
 *                          2)Create public methods to access the hidden data       
 *                           (getter methods==>Reads the data)
 *                            (setter methods==>Updates the data)
 */	
		
	}
	public String getCCN() {
		
		
		
		return CCN;	
		
	}
public int getSsn() {
	
	
	return Ssn;
	
	//you have to create a getter method for every private data,if you
	//want to read.
	
	//if you do not want to update the data, do not create setter method.
	//if you do not create setter method for private variables it means no data can be updated in the class
	//That kind of classes are called "immutable classes"
}
public boolean isCustomer() {
	
	
	return customer;
	
}
public void setCustomer(boolean customer) {
	
	this.customer=customer;
	
	
}





}
