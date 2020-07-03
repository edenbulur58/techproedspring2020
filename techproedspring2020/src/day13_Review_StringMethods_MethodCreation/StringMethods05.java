package day13_Review_StringMethods_MethodCreation;

public class StringMethods05 {

	public static void main(String[] args) {

String str="Java says hello world. Java String tutorial";		
	

String result=str.replaceFirst("java", "JAVA!");

System.out.print(result);


String result2=str.replaceFirst("a", "X");

System.out.println(result2);		
		
	}

}
