package Assignments;

public class A122_encapsulation {
	
	int age=27;
	String mail="abcd@gmail.com";
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	
	public static void main(String[] args) {
		 
		A122_encapsulation en= new A122_encapsulation();
		en.setAge(30);
		en.setMail("suryamandal99@gmail.com");
		System.out.println(en.getAge());
		System.out.println(en.getMail());
		
	}
}