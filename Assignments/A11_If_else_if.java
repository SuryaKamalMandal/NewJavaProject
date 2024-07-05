package Assignments;

public class A11_If_else_if {

	public static void main(String[] args)
	{
		
		int a=100;
		int b=500;
		
		if(a==b)
		{
			System.out.println("It is Equal");
		}
		else if(a>b)
		{
			System.out.println("It is Greater");
		}
		else if(a<b)
		{
			System.out.println("It is Smaller");
		}
		else if(a!=b)
		{
			System.out.println("It is not Equal");
		}
		else if(a<=b)
		{
			System.out.println("It is Less than or Equal");
		}
		else {
			System.out.println("It is Greater than or Equal");
		}
	}
}