package Assignments;

interface whatsapp {
	
	void texting();
	void group_text();
}
public class A48_class_interface implements whatsapp {

	public void texting() {
		System.out.println("Text Code is writtem here");
	}
	public void group_text() {
		System.out.println("Group chat Code is written here");
	}

	public static void main(String[] args) {
		
		A48_class_interface ci= new A48_class_interface();
		ci.texting();
		ci.group_text();
	}
}