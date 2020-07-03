package day22_stringbuilder;

public class DifferenceBetweenStringBuilderAndStringBuffer {

	public static void main(String[] args) {
		
	String s1="Ali";
	concatByUsingString(s1);
	System.out.println("String :" + s1);	
		
	StringBuilder s2=new StringBuilder("Ali");
	concatByUsingString(s2);
	System.out.println("String :" + s2);
	
	StringBuffer s3=new StringBuffer("Ali");
	concatByUsingString(s3);
	System.out.println("String :" + s3);
	}
//Concatenates to String
public static void 	concatByUsingString(String s1) {
	s1=s1+"Kemal";
	
}
//Concatenates to StringBuilder
public static void 	concatByUsingString(StringBuilder s2) {
	s2.append("Kemal");
}

//Concatenates to StringBuffer
public static void 	concatByUsingString(StringBuffer s3) {
	s3.append("Kemal");
}


}
