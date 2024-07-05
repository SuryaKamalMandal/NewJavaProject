package Assignments;

public class A57_overload_main {
	
	public static void main(String name) {
		System.out.println("Student NAME will Display here");
	}
	public static void main() {
		System.out.println("Blank main");
	}
	public static void main(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		main();
		main("Surya");
		main(50);
	}
}