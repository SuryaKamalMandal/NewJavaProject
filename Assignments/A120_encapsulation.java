package Assignments;

public class A120_encapsulation {
	
	int age;
	String name;
	double salary;
	void student_details(int age,String name,double salary)
	{
		this.age=age; //local to global 
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) {
		 
		A120_encapsulation en= new A120_encapsulation();
		en.student_details(27, "Surya", 10000);
		System.out.println(en.salary);
		System.out.println(en.name);
		System.out.println(en.age);
	}
}