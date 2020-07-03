package day09_stringmethods;

public class ReplaceAllMethod {

	public static void main(String[] args) {
		
	String str="Easy Java is Easy 12_34!";
	
	String str1=str.replaceAll("Easy", "Hard");
	
	String str2=str.replaceAll("\\s", "*");
	String str3=str.replaceAll("\\S", "*");	
	
	String str4=str.replaceAll("\\w", "*");	
	String str5=str.replaceAll("\\W", "*");	
	
	String str6=str.replaceAll("\\d", "*");	
	String str7=str.replaceAll("\\D", "*");
	
	String str8=str.replaceAll(" ", "x");
	String str9=str.replaceAll("Easy", " ");
	String str10=str.replaceAll("Easy", "");
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	System.out.println(str7);
	System.out.println(str8);
	System.out.println(str9);
	System.out.println(str10);
	
	
	
	
	
	
	
	
	}

}
