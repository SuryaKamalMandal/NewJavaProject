package Assignments;

import java.util.Arrays;

public class A99_string_class_program {

	public static void main(String[] args) {

		String s_name= "surya kamal mandal";
		
		String new_name[]= s_name.split(" ");
		System.out.println(new_name[0]);
		
		String new_name1[]= s_name.split(" ", 3);
		System.out.println(Arrays.toString(new_name1));
	}
}