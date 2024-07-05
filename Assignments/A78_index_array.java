package Assignments;

public class A78_index_array {
	
	static int num_check=15;
	public static void main(String[] args) {

		int number[]= new int[5];
		number[0]=15;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50;
		
		for(int i=0;i<number.length;i++) {
			
			if(num_check==number[i]) {
				
				System.out.println("Number 15 is Present in the given Array of length "+ number.length+" & Its Index is "+i);
			}	
		}
	}
}