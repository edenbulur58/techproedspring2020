package day13_Review_StringMethods_MethodCreation;

public class MethodCreation05 {

	public static void main(String[] args) {
		
		retiredOrNot("male",59);	
		
		
	}
	
public static void retiredOrNot(String gender, int age) {
	
	if(gender.equalsIgnoreCase("male") && age>65) {
	
		System.out.println("Retired");
	}
	
	else if(gender.equalsIgnoreCase("female") && age>60) {
		System.out.println("Retired");
	
	}
	else {
		System.out.println("Not Retired");
	}
	
}
	

}
