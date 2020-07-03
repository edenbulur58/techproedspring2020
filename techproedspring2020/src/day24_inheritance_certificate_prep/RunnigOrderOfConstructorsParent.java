package day24_inheritance_certificate_prep;

public class RunnigOrderOfConstructorsParent {

	public static void main(String[] args) {
		

	}

	public RunnigOrderOfConstructorsParent(int age) {
		
		System.out.println("This is the constructor of the Parent class");
	}
	
public RunnigOrderOfConstructorsParent(int num,String age) {
		
		System.out.println("Parent class with two parameters");
	}
}
