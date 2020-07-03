package day23_Encapsulation;

public class Encapsulation04 {

	public static void main(String[] args) {
		
		Encapsulation03 obj2=new Encapsulation03();
		System.out.println("Account value :"+obj2.getAccount());//12345
		System.out.println("Account value :"+obj2.getInitial());//c
		System.out.println("Male value :"+obj2.isMale());//true
		
		obj2.setAccount(6789);
	    obj2.setInitial('A');
	    obj2.setMale(false);
	
	    System.out.println("Update Account value :"+obj2.getAccount());//6789
		System.out.println("Update Account value :"+obj2.getInitial());//A
		System.out.println("Update Male value :"+obj2.isMale());//false
	    
	}

}
