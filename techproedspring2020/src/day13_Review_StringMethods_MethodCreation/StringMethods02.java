package day13_Review_StringMethods_MethodCreation;

public class StringMethods02 {

	public static void main(String[] args) {
		
		
	String str3="This is for you to practice";	
	boolean resultForİnitial= str3.startsWith("H");
	boolean resultForFirstWord=str3.startsWith("Hello");	
	boolean resultForNotBeginnings=str3.startsWith("Java", 6);

	System.out.println(resultForİnitial);
	System.out.println(resultForFirstWord);	
	System.out.println(resultForNotBeginnings);


	boolean resultForLastChracter= str3.endsWith("e");
	boolean resultForLastCharacters=str3.endsWith("here");	


	System.out.println(resultForLastChracter);
	System.out.println(resultForLastCharacters);	


	System.out.println(str3.isEmpty());	
		

	}

}
