package day25_overriding_polymorphisim;

public class Cat extends Animal {

	//overriding is between child and parent
	public static void main(String[] args) {
	Cat cat=new Cat();
	//Animal animal=new Animal();
	//animal.sound();==>not recommended must use super keyword
    cat.sound();
   

	}

//Access modifier of the overridden method (method in parent class)
//cannot be more restricted than overriding method (method in child class)

//private, static and final  methods cannot be overridden	

//public final int num=10 ==>if you use final keyword for a variable
//you can not change its value

//public final int add(){}==>if you use final keyword for a method,
//it means you can not override the method.
	
	public  void sound () {
		super.sound();//inside the overriding method, if you use "super" keyword
		//you can call overridden method.
		System.out.println("Cats meow");	
		
		
	}
	
}
