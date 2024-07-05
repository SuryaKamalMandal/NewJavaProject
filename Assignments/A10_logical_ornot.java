package Assignments;

public class A10_logical_ornot {

	public static void main(String[] args) {

		String name="Surya";
		String country="India";
		
		if(!(name=="Surya" || country=="India"))
		{
			System.out.println("This person is legal");
		}
		if(!(name=="Kamal" || country=="India"))
		{
			System.out.println("This person is not legal");
		}
		if(!(name=="Mandal" || country=="Spain"))
		{
			System.out.println("No Data Found");
		}
		if(!(name=="Surya" || country=="Bangladesh"))
		{
			System.out.println("Update the database");
		}
	}
}