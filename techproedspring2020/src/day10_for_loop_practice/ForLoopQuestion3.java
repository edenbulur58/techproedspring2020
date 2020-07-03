package day10_for_loop_practice;

public class ForLoopQuestion3 {

	public static void main(String[] args) {
		int count=1;
		int sum=0;
		for(int i=1; i<=200; i++) {
			
		if(i%4==0 && i%6==0) {
			sum=sum+i;
			
		count++;
		
		if(count==8)
					
		break;
		}
		
		}
		System.out.println(sum);
	}

}
