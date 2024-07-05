package Assignments;

import java.util.Arrays;

public class A81_reverse_array {
	
	static int s=0;
	public static void main(String[] args) {
		
		int rollno[]= {10,20,30,40,50};
		int rollno_copy[]= new int[rollno.length];
		
		for(int i=rollno.length-1;i>=0;i--) {
			
			rollno_copy[i]=rollno[s];
			s++;
		}
		System.out.println(Arrays.toString(rollno_copy));
	}
}