package day14_Review_Scope;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		converter(20,"sec");
		//converterOfUnit(20,20,20);
		
		}
	
	
/*	public static void converterOfUnit(int sec,int km, int gr) {
		
		
	double hourToSecond=sec*60*60;
	
	double milesToKm=km*1.6;
	
	double kgToGr=gr*1000;
	
	
	System.out.println(hourToSecond);
	
	System.out.println(milesToKm);
	
	System.out.println(kgToGr);
		
	}   */
	
public static void converter(double num, String unit) {
	
	switch(unit) {
	
	case "sec":
	System.out.println(num*60*60);
	break;
	case "km":
		System.out.println(num*1.6);
		break;
	case "gr":
		System.out.println(num*1000);
		break;	
	default:
		System.out.println("Please enter a valid data");
		
	
	}
	
	
	
	
	
	
}
	
	
	
	
	

}
