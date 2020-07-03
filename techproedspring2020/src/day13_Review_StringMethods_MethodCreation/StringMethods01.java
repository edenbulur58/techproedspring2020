package day13_Review_StringMethods_MethodCreation;

public class StringMethods01 {

	public static void main(String[] args) {
		
String str1="Hello Java I am here";
String str2="";

boolean resultForİnitial= str1.startsWith("H");
boolean resultForFirstWord=str1.startsWith("Hello");	
boolean resultForNotBeginnings=str1.startsWith("Java", 6);

System.out.println(resultForİnitial);
System.out.println(resultForFirstWord);	
System.out.println(resultForNotBeginnings);


boolean resultForLastChracter= str1.endsWith("e");
boolean resultForLastCharacters=str1.endsWith("here");	


System.out.println(resultForLastChracter);
System.out.println(resultForLastCharacters);	


System.out.println(str1.isEmpty());
System.out.println(str2.isEmpty());
	}

}
