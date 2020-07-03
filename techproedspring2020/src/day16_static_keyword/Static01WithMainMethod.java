package day16_static_keyword;

public class Static01WithMainMethod {

	public static void main(String[] args) {
		
	
		System.out.println(Static02WithoutMainMethod.name2);
		System.out.println(Static02WithoutMainMethod.num2); 
		Static02WithoutMainMethod.method2();
		

		Static02WithoutMainMethod obj1=new Static02WithoutMainMethod();
		
		System.out.println(obj1.name);
		System.out.println(obj1.num);
		obj1.method1();
		
	}

}
