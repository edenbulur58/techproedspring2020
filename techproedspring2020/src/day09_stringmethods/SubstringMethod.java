package day09_stringmethods;

public class SubstringMethod {

	public static void main(String[] args) {
		String str ="Banana, apple";
		
	String str1=str.substring(0);	
	String str2=str.substring(3);	
	String str3=str.substring(6);	
	String str4=str.substring(7);	
	String str5=str.substring(12);	
	String str6=str.substring(13);
	String str7=str.substring(0,3);
	String str8=str.substring(2,3);
	String str9=str.substring(4,4);
	//String str10=str.substring(4,2);
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	System.out.println(str7);
	System.out.println(str8);
	System.out.println(str9);
	//System.out.println(str10);
	}

}
