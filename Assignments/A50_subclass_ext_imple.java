package Assignments;

interface grandparents_ext {
	
	void login();
}
class parents_imple {
	
	void logout() {
		System.out.println("Logout will happen");
	}
}
public class A50_subclass_ext_imple extends parents_imple implements grandparents_ext{
	
	public void login() {
		System.out.println("Login will happen");
	}
	public static void main(String[] args) {
		
		A50_subclass_ext_imple sub= new A50_subclass_ext_imple();
		sub.login();
		sub.logout();
	}
}