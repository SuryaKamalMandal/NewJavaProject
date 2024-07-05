package Assignments;

public class A76_average_int_array {

	static int sum_num=0;
	static double average=0;
	public static void main(String[] args) {


		int number[]= new int[4];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;

		
		for(int i=0;i<number.length;i++) {
			
			sum_num= sum_num + number[i];
		}	
		System.out.println("The Total Sum of the given Array is--> "+sum_num);
		
		average= sum_num/number.length;
		System.out.println("The Average of the given sum is--> "+average);
	}
}