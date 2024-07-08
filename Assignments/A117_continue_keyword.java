package Assignments;

public class A117_continue_keyword {

	public static void main(String[] args) {
		
		int i;
		for(i=0;i<=6;i++) {
			
			if(i==5) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}