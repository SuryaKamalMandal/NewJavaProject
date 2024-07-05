package Assignments;

import java.util.Arrays;

public class A79_copy_array_into_another {

	public static void main(String[] args) {
		
		int number[]= new int[5];
		number[0]=15;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50;
		
		int number_copy[]= new int[number.length];
		
		for(int i=0;i<number.length;i++) {
			
			number_copy[i]=number[i];
		}
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(number_copy));

	}

}
