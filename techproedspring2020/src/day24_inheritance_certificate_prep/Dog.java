package day24_inheritance_certificate_prep;

public class Dog extends Mammal {
	
	public int height=1;
	protected int weight=50;
	
	public static void main(String[] args) {
	
		Dog dog=new Dog();
		System.out.println(dog.maxAge);//from parent Mammal class
		System.out.println(dog.name);  //from parent mammal class
	dog.feedBaby();//from parent Mammal class
		
	System.out.println(dog.eat);//from parent Animal class
	System.out.println(dog.move);//from parent Animal class
	dog.drink();//from parent Animal class
	
		System.out.println(dog.height);//from child dog class ı do not use static keyword for height instance variable 
		System.out.println(dog.weight);//therefore ı called height instance variable with dog object
	dog.bark();//from child dog class
	}
	
public void bark() {
	System.out.println("Dog is barking!!");
}

}
