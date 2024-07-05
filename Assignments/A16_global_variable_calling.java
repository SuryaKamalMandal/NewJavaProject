package Assignments;

public class A16_global_variable_calling {
	
	static int num=99;
	String name="Surya";
	
	public static void main(String[] args) {
		
		System.out.println(num);
		A16_global_variable_calling global=new A16_global_variable_calling();
		System.out.println(global.name);
	}
}