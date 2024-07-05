package Assignments;
public class A11_nested_if_else {

	public static void main(String[] args) {
		
		int a=500;
		int b=1000;
		if(a<b) {
			System.out.println("1");
			if(a>b) {
					System.out.println("2");
				 if(a==b) {
					System.out.println("3");
					if(a<=b) {
						System.out.println("4");
						if(a>=b) {
							System.out.println("5");
						}
						else {
							System.out.println("Break5");
						}
					}
					else {
						System.out.println("Break4");
					}
				}
				else {
					System.out.println("Break3");
				}
			}
			else {
				System.out.println("Break2");
			}
		}
		else {
			System.out.println("Break1");
		}
	}
}