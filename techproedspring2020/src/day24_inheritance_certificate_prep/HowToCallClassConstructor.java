package day24_inheritance_certificate_prep;

public class HowToCallClassConstructor extends HowToCallClassConstructorParent {

	public int age=12;
	public String name="Veli";
	
	public static void main(String[] args) {
		
	//HowToCallClassConstructor obj1=new HowToCallClassConstructor();
	HowToCallClassConstructor obj2=new HowToCallClassConstructor(7);
//Java selects the constructor according to the parameters 		
	}
	
public HowToCallClassConstructor() {
	//this(5);//this(); is used to call constructors inside the class
	super();
	
	System.out.println(super.name); //"super" is used to get data from parent class.
	System.out.println(super.num);//super can be second , third,...statement
	super.add();//You can use "super" more than once in a constructor
	System.out.println("Constructor without parameter");
	
}

public HowToCallClassConstructor(int num) {
	this();//this() must be the first statement in a constructor
	//In a constructor, you can use just one this()
	//this() and super () cannot be used at the same time inside a constructor
	
	System.out.println(this.name);//Veli, because this is for in class data
	System.out.println(this.age);
	
	//"this " can get data from parent class and in class ; however,
	//"super" can get data just from parent class
	System.out.println("Constructor with parameter");
		
}
}
