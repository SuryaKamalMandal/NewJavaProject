package Assignments;

public class A41_this_calling_para {
	
	A41_this_calling_para(int a) {
		this("Surya","Mandal");
		System.out.println("Constructor have int as Para");
	}
	A41_this_calling_para(double b) {
		System.out.println("Constructor have double as Para");
	}
	A41_this_calling_para(String c, String d) {
		this(73.91);
		System.out.println("Constructor have String as 2 Para");
	}
	
	public static void main(String[] args) {
		
		new A41_this_calling_para(900);
	}
}