package day09_stringmethods;

public class ReplaceMethod {

	public static void main(String[] args) {
		
	String str="Easy Java is Easy";
	
	
	String str1=str.replace('a', 'x');
	String str2=str.replace("Easy", "Hard");	
	String str3=str.replace("Ea", "Hard");	
	String str4=str.replace("Easy Java", "Hard");	
	String str5=str.replace(" ", "Hard");
	String str6=str.replace("Easy", " ");
	String str7=str.replace("Easy", "");
	String str8=str.replace('d', 'z');
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	System.out.println(str6);
	System.out.println(str7);
	System.out.println(str8);
	
	}

}
