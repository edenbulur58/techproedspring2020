package day28_abstraction_interface;

public abstract class Animal {
	
	public abstract String getName();

}


abstract class BigCat extends Animal{
	
	public String getName() {
		return "BigCat";
		
	}
	public abstract void roar();
}

//if abstract method from grand parent is inherited from parent class, no need to
//inherit it from child class.if you want you can do it, it means you are overriding the method.
class Lion  extends BigCat {
	
  //public String getName() {
//		return "BigCat from Lion class";
		
//	}
	
	
	public  void roar() {
		System.out.println("Lions roar");
	}
}