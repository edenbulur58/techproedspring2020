package day09_stringmethods;

public class ToUpperCaseAndToLowerCaseMethods {

	public static void main(String[] args) {
		
	String str="Learn Java";
	
	String str1=str.toUpperCase();
	String str2=str.toLowerCase();
	String str3=str.toUpperCase().toLowerCase();
	String str4=str.substring(6).toUpperCase();
	String str5=str.substring(2, 5).toLowerCase();
	String str6=str.replace("L", "").toUpperCase();
		
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	
		
		
		
	}

}
