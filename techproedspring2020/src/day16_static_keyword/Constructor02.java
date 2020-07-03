package day16_static_keyword;

public class Constructor02 {
	int x=3;
	int y=5;
	
	Constructor02(){
	
		x+=1;
	
	System.out.println("-x"+x);
		
	}		
	Constructor02(int i){
		
		this();
		this.y=i;
		x+=y;
		
	
	System.out.println("-x"+x);
		
	}	
	
Constructor02(int i,int i2){
		
		this(3);
		this.x-=4;
		x+=y;
		
	
	System.out.println("-x"+x);
		
	}		
	
	
	
		
	public static void main(String[] args) {
		
	
	
	Constructor02 obj2=new 	Constructor02(4,3);
	Constructor01 obj1=new 	Constructor01();
		
	
	}
}
