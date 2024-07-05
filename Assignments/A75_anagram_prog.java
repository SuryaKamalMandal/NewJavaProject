package Assignments;

import java.util.Arrays;

public class A75_anagram_prog {

	public static void main(String[] args) {

		String ex1= "cat";
		String ex2= "act";
		
		char ex3[] =ex1.toCharArray();
		char ex4[] =ex2.toCharArray();
		
		if(ex1.length()!=ex2.length()) {
			System.out.println("It is not a aragram");
		}
		else {
		Arrays.sort(ex3);
		Arrays.sort(ex4);
		
		System.out.println(Arrays.toString(ex3));
		System.out.println(Arrays.toString(ex4));
		
		boolean result= Arrays.equals(ex3, ex4);
		System.out.println(result);
		}		
	}
}