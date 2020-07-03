package day13_Review_StringMethods_MethodCreation;

public class MethodCreaation04 {

	public static void main(String[] args) {
		
		firstAndLastName("Ali","okcu");	
		
	}
	
	public static void firstAndLastName(String firstName,String lastName) {
		
	if(firstName.charAt(0)>='A'&& lastName.charAt(0)>='A' && firstName.charAt(0)<='Z' && lastName.charAt(0)<='Z' ) {
		System.out.println("Good job");
	}
	else {
		System.out.println("Normal");
	}
		
		
	}
	
	
	

}
