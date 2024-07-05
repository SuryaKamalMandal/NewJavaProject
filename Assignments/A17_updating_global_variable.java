package Assignments;

public class A17_updating_global_variable {
	
	static long a=5115154;
	static boolean b=false;
	char q='S';
	double e=98.98;
	
	public static void main(String[] args) {
		
		a= 78541236;
		b=true;
		System.out.println(a);
		System.out.println(b);
		
		A17_updating_global_variable update=new A17_updating_global_variable();
		System.out.println(update.q='M');
		System.out.println(update.e=88.98);
	}
}