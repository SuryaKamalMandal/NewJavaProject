package Assignments;

import java.util.Arrays;

public class A100_convert_string_into_array {

	public static void main(String[] args) {
		
		String s_name= "surya kamal mandal";
		
		String new_name1[]= s_name.split(" ", 3);
		System.out.println(Arrays.toString(new_name1));
	}
}