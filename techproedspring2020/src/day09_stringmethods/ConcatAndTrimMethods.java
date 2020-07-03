package day09_stringmethods;

public class ConcatAndTrimMethods {

	public static void main(String[] args) {
		
	String str1="Learn"+" "+"Java";
	String str2="Learn".concat("").concat("Java");
	
	System.out.println(str1);
	System.out.println(str2);
		
	String str3="   Learn Java";
	System.out.println(str3);
	System.out.println(str3.trim());
	
	String str4="Learn Java       ";
	System.out.println(str4);
	System.out.println(str4.trim());
	
	String str5="     Learn Java       ";
	System.out.println(str5);
	System.out.println(str5.trim());
		
	}

}
