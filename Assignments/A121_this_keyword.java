package Assignments;

public class A121_this_keyword {
	
	int no;
	String name;
	double salary;
	void student_info(int no,double salary,String name)
	{
		this.no=no; //local to global 
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) {
		 
		A121_this_keyword en= new A121_this_keyword();
		en.student_info(878796960, 10000, "Surya");
		System.out.println(en.name);
		System.out.println(en.salary);
		System.out.println(en.no);
	}
}