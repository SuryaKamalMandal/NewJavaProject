package Assignments;

import java.util.Scanner;

public class A56_switch_prog {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int choice= s.nextInt();
		
		switch(choice) {
		
		case 1: {
			System.out.println("Case 1 Execute");
			break;
		}
		case 2: {
			System.out.println("Case 2 Execute");
			break;
		}
		case 3: {
			System.out.println("Case 3 Execute");
			break;
		}
		case 4: {
			System.out.println("Case 4 Execute");
			break;
		}
		default: {
			System.out.println("default is Executing");
		}
	}
}
}