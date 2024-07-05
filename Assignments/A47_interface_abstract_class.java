package Assignments;

interface grand_parents {
	
	void login();
	void logout();
}
abstract class parent implements grand_parents {
	
	abstract void profile();
	abstract void homepage();
	
	void username() {
		System.out.println("Username name code is here");
	}
	void pass() {
		System.out.println("Password code is here");
	}
}
public class A47_interface_abstract_class extends parent {
	
	public void login() {
		System.out.println("Login of website");
	}
	public void logout() {
		System.out.println("Logout of website");
	}
	void profile() {
		System.out.println("Profile of website");
	}
	void homepage() {
		System.out.println("Homepage of website");
	}
	
	static void message() {
		System.out.println("Message page of website");
	}
	static void terms_condition() {
		System.out.println("T&C of website");
	}
	
	public static void main(String[] args) {
		
		A47_interface_abstract_class iac=new A47_interface_abstract_class();
		iac.login();
		iac.logout();
		iac.profile();
		iac.homepage();
		iac.username();
		iac.pass();
		message();
		terms_condition();
	}
}