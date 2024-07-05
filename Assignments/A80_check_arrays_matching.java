package Assignments;

import java.util.Arrays;

public class A80_check_arrays_matching {

	public static void main(String[] args) {
		
		int number[]= new int[5];
		number[0]=15;
		number[1]=20;
		number[2]=70;
		number[3]=50;
		number[4]=60;
		
		int number_copy[]= new int[number.length];
		
		for(int i=0;i<number.length;i++) {
			
			number_copy[i]=number[i];
		}
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(number_copy));
		
		if(Arrays.equals(number, number_copy)) {
			System.out.println("Both the ARRAYS are EQUALs");
		}
		else {
			System.out.println("Arrays doesnot MATCH");
		}
	}
}