package Assignments;

public class A9_nested_ifelse_block {

	public static void main(String[] args) {
		
		int a=500;
		int b=501;
		int c=1000;
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println("c is Greater then a & b");
			}
			else
			{
				System.out.println("a & b is Greater then c");
			}
			
		}
		else
		{
			System.out.println("b is Smaller");
		}
	}
}