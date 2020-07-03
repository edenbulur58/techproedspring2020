package day09_stringmethods;

public class IndexOfMethod {

	public static void main(String[] args) {
		
String str="Banana, apple";

int idx1=str.indexOf("l");
int idx2=str.indexOf("a");
int idx3=str.indexOf("w");	
int idx4=str.indexOf("Text");
int idx5=str.indexOf("apple");	
int idx6=str.indexOf("a",4);
int idx7=str.indexOf("a", 5);

System.out.println(idx1);
System.out.println(idx2);
System.out.println(idx3);
System.out.println(idx4);
System.out.println(idx5);
System.out.println(idx6);
System.out.println(idx7);

	}

}
