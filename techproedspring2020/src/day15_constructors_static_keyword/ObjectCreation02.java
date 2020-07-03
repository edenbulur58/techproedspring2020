package day15_constructors_static_keyword;


public class ObjectCreation02 {

	int height=178;
	int weight;
	String name;
	String gender;
//Create constructor outside the main method like instance variables	
//When you create any constructor, default constructor will be deleted by garbage collector


ObjectCreation02(){
	
	
	
	
}

ObjectCreation02(String gender){
	
	this.gender=gender;	
		
		
		
	}
ObjectCreation02(String name, int weight){
	
	this.name=name;
	this.weight=weight;
	
}	
	
	
	
	public static void main(String[] args) {
		
		ObjectCreation02 human1=new ObjectCreation02();	
		
		System.out.println(human1.height);
		
		
		human1.name="Ahmet";
		System.out.println(human1.name);
		
ObjectCreation02 human2=new ObjectCreation02("Ayse",80);
System.out.println(human2.height);
System.out.println(human2.weight);
System.out.println(human2.name);
System.out.println(human2.gender);
	
	
	}
	
	
	
	
	

}
